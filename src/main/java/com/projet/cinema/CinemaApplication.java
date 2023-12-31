package com.projet.cinema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projet.cinema.service.CinemaInitServiceImpl;
import com.projet.cinema.service.ICinemaService;

@SpringBootApplication
public class CinemaApplication implements CommandLineRunner{
	@Autowired
	private ICinemaService cinemaService;
	public static void main(String[] args) {
		SpringApplication.run(CinemaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		cinemaService.initVilles();
		cinemaService.initCinemas();
		cinemaService.initSalles();
		cinemaService.initPlaces();
		cinemaService.initSeances();
		cinemaService.initCategories();
		cinemaService.initFilms();
		cinemaService.initProjections();
		cinemaService.initTickets();
	}

}
