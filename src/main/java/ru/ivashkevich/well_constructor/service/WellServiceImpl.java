package ru.ivashkevich.well_constructor.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ivashkevich.well_constructor.dao.WellRepository;
import ru.ivashkevich.well_constructor.model.Well;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WellServiceImpl implements WellService{

    private final WellRepository wellRepository;

    @Override
    public Well getWellById(String id) {
        return null;
    }

    @Override
    public List<Well> getAllWells() {
        return null;
    }

    @Override
    public void addWell(Well well) {

    }
}
