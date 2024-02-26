package com.sezgin.n11.entities;

import com.sezgin.n11.enums.EnumHouseType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name = "HOUSE")
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "House")
    @SequenceGenerator(name = "House", sequenceName = "HOUSE_ID_SEQ")
    private long id;

    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

    @Column(name = "ADDRESS", nullable = false, length = 100)
    private String address;

    @Column(name = "PRICE", nullable = false)
    private BigDecimal price;

    @Column(name = "ROOM_COUNT", nullable = false)
    private Integer roomCount;

    @Column(name = "HALL_COUNT", nullable = false)
    private Integer hallCount;

    @Column(name = "SQUARE_METER", nullable = false)
    private Integer squareMeter;

    @Column(name = "HOUSE_TYPE", nullable = false)
    private EnumHouseType houseType;
}
