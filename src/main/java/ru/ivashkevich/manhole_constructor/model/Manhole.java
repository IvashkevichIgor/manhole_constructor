package ru.ivashkevich.manhole_constructor.model;

import java.util.EnumMap;

public abstract class Manhole {
    private static double minWorkChamberHeight;

    private String number;
    private double trayDepth;
    private PavementType pavementType;
    private double manholeDiameter;
    private double pipeDiameter;

    private EnumMap<ReinforcedConcreteElement, Integer> elements;


}
