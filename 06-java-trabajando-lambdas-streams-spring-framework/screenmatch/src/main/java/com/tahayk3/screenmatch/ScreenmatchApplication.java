package com.tahayk3.screenmatch;

import com.tahayk3.screenmatch.model.DatosEpisodio;
import com.tahayk3.screenmatch.model.DatosSerie;
import com.tahayk3.screenmatch.model.DatosTemporadas;
import com.tahayk3.screenmatch.principal.EjemploStreams;
import com.tahayk3.screenmatch.principal.Principal;
import com.tahayk3.screenmatch.service.ConsumoAPI;
import com.tahayk3.screenmatch.service.ConvierteDatos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.muestraElMenu();
		//EjemploStreams ejemploStreams = new EjemploStreams();
		//ejemploStreams.muestraEjemplo();
	}
}
