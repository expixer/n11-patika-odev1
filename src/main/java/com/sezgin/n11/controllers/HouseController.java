package com.sezgin.n11.controllers;

import com.sezgin.n11.entities.House;
import com.sezgin.n11.entities.dummies.DummyHouses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/houses")
public class HouseController {

    @GetMapping("/ev")
    public List<House> getEvList() {
        return new DummyHouses().getEvList();
    }

    @GetMapping("/villa")
    public List<House> getVillaList() {
        return new DummyHouses().getVillaList();
    }

    @GetMapping("/yazlik")
    public List<House> getYazlikList() {
        return new DummyHouses().getYazlikList();
    }

}
