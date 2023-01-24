package ru.ivashkevich.well_constructor.model;

public enum PavementType {
    ROAD ("дорога", 0),
    SIDEWALK("тротуар", 0),
    LAWN("газон", 0.07),
    UNDEVELOPED_AREA("незастроенная территория", 0.2);

    private String name;
    private double additionalHeight;

    PavementType(String name, double additionalHeight) {
        this.name = name;
        this.additionalHeight = additionalHeight;
    }

    public String getName() {
        return name;
    }

    public double getAdditionalHeight() {
        return additionalHeight;
    }
}
