package com.sezgin.n11.entities.dummies;

import com.sezgin.n11.entities.House;
import com.sezgin.n11.enums.EnumHouseType;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class DummyHouses {
    public List<House> getEvList() {
        House ev = new House();
        ev.setId(1);
        ev.setName("Ev1");
        ev.setHouseType(EnumHouseType.EV);
        ev.setAddress("Istanbul");
        ev.setPrice(BigDecimal.valueOf(1000000.0));
        ev.setRoomCount(3);
        ev.setHallCount(1);
        ev.setSquareMeter(150);

        House ev2 = new House();
        ev2.setId(2);
        ev2.setName("Ev2");
        ev2.setHouseType(EnumHouseType.EV);
        ev2.setAddress("Ankara");
        ev2.setPrice(BigDecimal.valueOf(800000.0));
        ev2.setRoomCount(2);
        ev2.setHallCount(1);
        ev2.setSquareMeter(100);

        House ev3 = new House();
        ev3.setId(3);
        ev3.setName("Ev3");
        ev3.setHouseType(EnumHouseType.EV);
        ev3.setAddress("Izmir");
        ev3.setPrice(BigDecimal.valueOf(1200000.0));
        ev3.setRoomCount(4);
        ev3.setHallCount(2);
        ev3.setSquareMeter(200);

        return List.of(ev, ev2, ev3);
    }

    public List<House> getVillaList() {
        House villa = new House();
        villa.setId(4);
        villa.setName("Villa1");
        villa.setHouseType(EnumHouseType.VILLA);
        villa.setAddress("Izmir");
        villa.setPrice(BigDecimal.valueOf(2000000.0));
        villa.setRoomCount(5);
        villa.setHallCount(2);
        villa.setSquareMeter(300);

        House villa2 = new House();
        villa2.setId(5);
        villa2.setName("Villa2");
        villa2.setHouseType(EnumHouseType.VILLA);
        villa2.setAddress("Istanbul");
        villa2.setPrice(BigDecimal.valueOf(1500000.0));
        villa2.setRoomCount(4);
        villa2.setHallCount(1);
        villa2.setSquareMeter(250);

        House villa3 = new House();
        villa3.setId(6);
        villa3.setName("Villa3");
        villa3.setHouseType(EnumHouseType.VILLA);
        villa3.setAddress("Ankara");
        villa3.setPrice(BigDecimal.valueOf(1800000.0));
        villa3.setRoomCount(5);
        villa3.setHallCount(2);
        villa3.setSquareMeter(300);

        return List.of(villa, villa2, villa3);
    }

    public List<House> getYazlikList() {
        House yazlik = new House();
        yazlik.setId(7);
        yazlik.setName("Yazlik1");
        yazlik.setHouseType(EnumHouseType.YAZLIK);
        yazlik.setAddress("Antalya");
        yazlik.setPrice(BigDecimal.valueOf(500000.0));
        yazlik.setRoomCount(2);
        yazlik.setHallCount(1);
        yazlik.setSquareMeter(100);

        House yazlik2 = new House();
        yazlik2.setId(8);
        yazlik2.setName("Yazlik2");
        yazlik2.setHouseType(EnumHouseType.YAZLIK);
        yazlik2.setAddress("Bodrum");
        yazlik2.setPrice(BigDecimal.valueOf(600000.0));
        yazlik2.setRoomCount(3);
        yazlik2.setHallCount(1);
        yazlik2.setSquareMeter(150);

        House yazlik3 = new House();
        yazlik3.setId(9);
        yazlik3.setName("Yazlik3");
        yazlik3.setHouseType(EnumHouseType.YAZLIK);
        yazlik3.setAddress("Marmaris");
        yazlik3.setPrice(BigDecimal.valueOf(700000.0));
        yazlik3.setRoomCount(4);
        yazlik3.setHallCount(2);
        yazlik3.setSquareMeter(200);

        return List.of(yazlik, yazlik2, yazlik3);
    }
}
