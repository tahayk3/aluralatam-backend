package com.tahayk3.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public record DatosEpisodio(
        @JsonAlias("Title")
        String titulo,
        @JsonAlias("Episode")
        Integer numeroEpisodio,
        @JsonAlias("imdbRating")
        String evaluacion,
        @JsonAlias("Released")
        String fechaDeLanzamiento
) {
}
