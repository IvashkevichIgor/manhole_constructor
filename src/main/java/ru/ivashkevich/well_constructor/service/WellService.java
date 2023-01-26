package ru.ivashkevich.well_constructor.service;

import ru.ivashkevich.well_constructor.model.Well;

import java.util.List;

public interface WellService {

    Well getWellById(String id);

    List<Well> getAllWells();

    void addWell(Well well);
}
