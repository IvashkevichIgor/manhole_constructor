package ru.ivashkevich.well_constructor.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ivashkevich.well_constructor.dao.WellEntity;
import ru.ivashkevich.well_constructor.dao.WellRepository;
import ru.ivashkevich.well_constructor.exception.WellNotFoundException;
import ru.ivashkevich.well_constructor.mapper.WellToEntityMapper;
import ru.ivashkevich.well_constructor.model.Well;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class WellServiceImpl implements WellService{

    private final WellRepository wellRepository;
    private final WellToEntityMapper mapper;

    @Override
    public Well getWellById(String id) {
        WellEntity entity = wellRepository.findById(id)
                .orElseThrow(() -> new WellNotFoundException("Well not found: id = " + id));
        return mapper.wellEntityToWell(entity);
    }

    @Override
    public List<Well> getAllWells() {
        Iterable<WellEntity> wellEntities = wellRepository.findAll();

        List<Well> wellList = new ArrayList<>();
        for (WellEntity wellEntity : wellEntities) {
            wellList.add(mapper.wellEntityToWell(wellEntity));
        }
        return wellList;
    }

    @Override
    public void addWell(Well well) {
        wellRepository.save(mapper.wellToWellEntity(well));
    }
}
