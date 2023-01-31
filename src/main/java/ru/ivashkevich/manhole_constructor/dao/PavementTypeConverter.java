package ru.ivashkevich.manhole_constructor.dao;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import ru.ivashkevich.manhole_constructor.model.PavementType;

import java.util.stream.Stream;

@Converter(autoApply = true)
public class PavementTypeConverter implements AttributeConverter<PavementType, String> {

    @Override
    public String convertToDatabaseColumn(PavementType pavementType) {
        if (pavementType == null){
            return null;
        }
        return pavementType.getName();
    }

    @Override
    public PavementType convertToEntityAttribute(String name) {
        if (name == null) {
            return null;
        }

        return Stream.of(PavementType.values())
                .filter(s -> s.getName().equals(name))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
