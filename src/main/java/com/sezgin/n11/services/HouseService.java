package com.sezgin.n11.services;


import com.sezgin.n11.entities.House;
import com.sezgin.n11.entities.dummies.DummyHouses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class HouseService {

    public BigDecimal sumOfEvPrices() {
        List<House> evList = new DummyHouses().getEvList();
        return evList.stream()
                .map(House::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public BigDecimal sumOfVillaPrices() {
        List<House> villaList = new DummyHouses().getVillaList();
        return villaList.stream()
                .map(House::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public BigDecimal sumOfYazlikPrices() {
        List<House> yazlikList = new DummyHouses().getYazlikList();
        return yazlikList.stream()
                .map(House::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public BigDecimal sumOfAllPrices() {
        return sumOfEvPrices().add(sumOfVillaPrices()).add(sumOfYazlikPrices());
    }

    public Integer averageOfEvSquareMeters() {
        List<House> evList = new DummyHouses().getEvList();
        return (int) evList.stream().mapToDouble(House::getSquareMeter).average().orElse(0);
    }

    public Integer averageOfVillaSquareMeters() {
        List<House> villaList = new DummyHouses().getVillaList();
        return (int) villaList.stream().mapToDouble(House::getSquareMeter).average().orElse(0);
    }

    public Integer averageOfYazlikSquareMeters() {
        List<House> yazlikList = new DummyHouses().getYazlikList();
        return (int) yazlikList.stream().mapToDouble(House::getSquareMeter).average().orElse(0);
    }

    public Integer averageOfAllSquareMeters() {
        return (averageOfEvSquareMeters() + averageOfVillaSquareMeters() + averageOfYazlikSquareMeters()) / 3;
    }

    public List<House> filterByRoomCountAndHallCount(int roomCount, int hallCount) {
        List<House> evList = new DummyHouses().getEvList();
        List<House> villaList = new DummyHouses().getVillaList();
        List<House> yazlikList = new DummyHouses().getYazlikList();

        List<House> mutableList = new ArrayList<>(evList);
        mutableList.addAll(villaList);
        mutableList.addAll(yazlikList);
        mutableList.removeIf(house -> house.getRoomCount() != roomCount || house.getHallCount() != hallCount);


        return mutableList;
    }
}
