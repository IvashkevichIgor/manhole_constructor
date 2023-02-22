package ru.ivashkevich.manhole_constructor.dao;

import jakarta.persistence.*;
import lombok.*;
import ru.ivashkevich.manhole_constructor.model.PavementType;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass       // вероятно такой вариант не подходит в случае добавления полей с EnumMap
public abstract class ManholeEntity {
    private static double minWorkChamberHeight;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "number")
    private String number;
    @Column(name = "outlet_tray_depth")
    private double outletTrayDepth;
    @Column(name = "pavement_type")
    private PavementType pavementType;
    @Column(name = "manhole_diameter")
    private double manholeDiameter;
    @Column(name = "pipe_diameter")
    private int pipeDiameter;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ManholeEntity that = (ManholeEntity) o;

        if (Double.compare(that.outletTrayDepth, outletTrayDepth) != 0) return false;
        if (Double.compare(that.manholeDiameter, manholeDiameter) != 0) return false;
        if (pipeDiameter != that.pipeDiameter) return false;
        if (!number.equals(that.number)) return false;
        return pavementType == that.pavementType;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = number.hashCode();
        temp = Double.doubleToLongBits(outletTrayDepth);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + pavementType.hashCode();
        temp = Double.doubleToLongBits(manholeDiameter);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + pipeDiameter;
        return result;
    }
}
