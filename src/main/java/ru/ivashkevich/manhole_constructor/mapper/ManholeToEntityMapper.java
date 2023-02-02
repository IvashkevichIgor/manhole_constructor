package ru.ivashkevich.manhole_constructor.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.SubclassExhaustiveStrategy;
import org.mapstruct.SubclassMapping;
import ru.ivashkevich.manhole_constructor.dao.ManholeEntity;
import ru.ivashkevich.manhole_constructor.dao.SewerManholeEntity;
import ru.ivashkevich.manhole_constructor.model.Manhole;
import ru.ivashkevich.manhole_constructor.model.SewerManhole;

@Mapper(componentModel = "spring", subclassExhaustiveStrategy = SubclassExhaustiveStrategy.RUNTIME_EXCEPTION)
public interface ManholeToEntityMapper {
    @SubclassMapping(target = SewerManholeEntity.class, source = SewerManhole.class)
    ManholeEntity manholeToEntity(Manhole manhole);

    @SubclassMapping(target = SewerManhole.class, source = SewerManholeEntity.class)
    Manhole entityToManhole(ManholeEntity entity);

    SewerManholeEntity sewerManholeToEntity(SewerManhole manhole);
    SewerManhole entityToSewerManhole(SewerManholeEntity entity);
}
