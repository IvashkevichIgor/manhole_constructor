package ru.ivashkevich.manhole_constructor.model;

public class WaterManhole extends Manhole {

    private static double minWorkChamberHeight = 1.5;

    private boolean isFireHydrant;

    /*public WaterManhole() {
        if(this.getNumber().startsWith("ПГ")){
            this.setFireHydrant(true);
        }
    }*/
}
