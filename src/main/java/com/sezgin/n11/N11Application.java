package com.sezgin.n11;

import com.sezgin.n11.controllers.HouseController;
import com.sezgin.n11.entities.House;
import com.sezgin.n11.services.HouseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class N11Application {

	public static void main(String[] args) {
		SpringApplication.run(N11Application.class, args);

		HouseService houseService = new HouseService();
		log.info("Sum of ev prices: " + houseService.sumOfEvPrices());
		log.info("Sum of villa prices: " + houseService.sumOfVillaPrices());
		log.info("Sum of yazlik prices: " + houseService.sumOfYazlikPrices());
		log.info("Sum of all prices: " + houseService.sumOfAllPrices());
		log.info("Average of ev square meters: " + houseService.averageOfEvSquareMeters());
		log.info("Average of villa square meters: " + houseService.averageOfVillaSquareMeters());
		log.info("Average of yazlik square meters: " + houseService.averageOfYazlikSquareMeters());
		log.info("Average of all square meters: " + houseService.averageOfAllSquareMeters());
		log.info("Filter by room count and hall count: " + houseService.filterByRoomCountAndHallCount(3, 1)
				.stream()
				.map(House::getName)
				.toList());

		HouseController houseController = new HouseController();
		log.info("Get ev list: " + houseController.getEvList()
				.stream()
				.map(House::getName)
				.toList());
		log.info("Get villa list: " + houseController.getVillaList()
				.stream()
				.map(House::getName)
				.toList());
		log.info("Get yazlik list: " + houseController.getYazlikList()
				.stream()
				.map(House::getName)
				.toList());

	}

}
