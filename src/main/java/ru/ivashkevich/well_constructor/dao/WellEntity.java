package ru.ivashkevich.well_constructor.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.ivashkevich.well_constructor.model.PavementType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "wells")
public abstract class WellEntity {
    private static double minWorkingChamberHeight;

    @Id // может ввести отдельное значение для ID? а номер сделать генерируемым, исходя из типа колодца?
    private String number;
    @Column(name = "tray_depth")
    private double trayDepth;
    private PavementType pavementType;
    @Column(name = "well_diameter")
    private double wellDiameter;
    @Column(name = "pipe_diameter")
    private double pipeDiameter;
}
