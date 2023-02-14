package ru.ivashkevich.manhole_constructor.model;

import lombok.Getter;
import lombok.Setter;

import java.util.EnumMap;

@Getter
public abstract class Manhole {

    private String number;
    private double outletTrayDepth;
    private PavementType pavementType;
    private double manholeDiameter;
    private double pipeDiameter;

    private double heightUnderPipe;
    private double minHeight;
    private double height;

    private EnumMap<ReinforcedConcreteElement, Integer> neckElements;

    private EnumMap<ReinforcedConcreteElement, Integer> workChamberElements;

    public Manhole(String number, double outletTrayDepth, PavementType pavementType, double manholeDiameter, double pipeDiameter) {
        this.number = number;
        this.outletTrayDepth = outletTrayDepth;
        this.pavementType = pavementType;
        this.manholeDiameter = manholeDiameter;
        this.pipeDiameter = pipeDiameter;

        setHeightUnderPipe();
        setMinHeight();
    }

    private void setMinHeight(){
        minHeight = pavementType.getAdditionalHeight() + outletTrayDepth + heightUnderPipe;
    }

    protected abstract void setHeightUnderPipe();

    protected abstract void constructManholeNeck();

    protected abstract void constructManholeWorkChamber();
}
