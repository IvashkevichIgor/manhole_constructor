package ru.ivashkevich.manhole_constructor.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SewerManhole extends Manhole{

    private double inletTrayDepth;
    private double minWorkChamberHeight;
    
    //private boolean isDropManhole;
}
