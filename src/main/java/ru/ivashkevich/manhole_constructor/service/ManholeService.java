package ru.ivashkevich.manhole_constructor.service;

import ru.ivashkevich.manhole_constructor.model.Manhole;

import java.util.List;

public interface ManholeService {

    Manhole getManholeById(String id);

    List<Manhole> getAllManholes();

    void addManhole(Manhole manhole);
}
