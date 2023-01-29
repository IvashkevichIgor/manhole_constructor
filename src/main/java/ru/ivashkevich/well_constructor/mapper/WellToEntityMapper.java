package ru.ivashkevich.well_constructor.mapper;

import org.mapstruct.Mapper;
import ru.ivashkevich.well_constructor.dao.WellEntity;
import ru.ivashkevich.well_constructor.model.Well;

@Mapper(componentModel = "spring")
public interface WellToEntityMapper {
    WellEntity wellToWellEntity(Well well);

    Well wellEntityToWell(WellEntity entity);
}
