package ru.ivashkevich.well_constructor.model;

public abstract class Well {
    private static double minWorkingChamberHeight;

    private String number;
    private double trayDepth;
    private PavementType pavementType;
    private double wellDiameter;
    private double pipeDiameter;

    //тут думаю надо отдельно собрать горловину и отдельно рабочую камеру
    //вообще в идеале, чтобы это была отдельная таблица
    // то есть колодец ссылался на primaryKey с этими элементами
    //private EnumMap<ReinforcedConcreteElement, Integer> elements;


}
