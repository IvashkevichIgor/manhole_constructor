package ru.ivashkevich.manhole_constructor.dao;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.*;
import org.hibernate.Hibernate;
import ru.ivashkevich.manhole_constructor.model.PavementType;

import java.util.Objects;

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
    private String number;
    private double outletTrayDepth;
    private PavementType pavementType;
    private double manholeDiameter;
    private double pipeDiameter;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ManholeEntity that = (ManholeEntity) o;
        return number != null && Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
