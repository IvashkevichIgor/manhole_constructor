package ru.ivashkevich.manhole_constructor.mapper;

import org.mapstruct.Mapper;
import ru.ivashkevich.manhole_constructor.dao.ManholeEntity;
import ru.ivashkevich.manhole_constructor.model.Manhole;

@Mapper(componentModel = "spring")
public interface ManholeToEntityMapper {
    ManholeEntity manholeToManholeEntity(Manhole manhole);

    Manhole manholeEntityToManhole(ManholeEntity entity);
}
