package ru.ivashkevich.manhole_constructor.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.ivashkevich.manhole_constructor.model.PavementType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "manholes")
public abstract class ManholeEntity {
    private static double minWorkChamberHeight;

    @Id // может ввести отдельное значение для ID? а номер сделать генерируемым, исходя из типа колодца?
    private String number;
    @Column(name = "tray_depth")
    private double trayDepth;
    private PavementType pavementType;
    @Column(name = "manhole_diameter")
    private double manholeDiameter;
    @Column(name = "pipe_diameter")
    private double pipeDiameter;
}
