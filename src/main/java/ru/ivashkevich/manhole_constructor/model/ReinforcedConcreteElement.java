package ru.ivashkevich.manhole_constructor.model;

public enum ReinforcedConcreteElement {
    KS7_3("КС7.3", 0.7, 0.3),
    KS7_9("КС7.9", 0.7, 0.9),
    KS10_3("КС10.3", 1.0, 0.3),
    KS10_6("КС10.6", 1.0, 0.6),
    KS10_9("КС10.9", 1.0, 0.9),
    KS15_6("КС15.6", 1.5, 0.6),
    KS15_9("КС15.6", 1.5, 0.9),
    KS20_6("КС20.6", 2.0, 0.6),
    KS20_9("КС20.9", 2.0, 0.9),
    KS20_12("КС20.12", 2.0, 1.2),

    KO6("КО6", 0.58, 0.07),
    UOP6("УОП-6", 1.6, 0.33),

    PN10("ПН10", 1.5, 0.1),
    PN15("ПН15", 2.0, 0.12),
    PN20("ПН20", 2.5, 0.12),

    PP10("ПП10", 1.0, 0.15),
    PP1_15("1ПП15", 1.5, 0.15),
    PP2_15("2ПП15", 1.5, 0.15),
    PP3_15("3ПП15", 1.5, 0.15),
    PP1_20("1ПП20", 2.0, 0.16),
    PP2_20("2ПП20", 2.0, 0.16),
    PP3_20("3ПП20", 2.0, 0.16);

    private String name;
    private double diameter;
    private double height;

    ReinforcedConcreteElement(String name, double diameter, double height) {
        this.name = name;
        this.diameter = diameter;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getHeight() {
        return height;
    }
}
