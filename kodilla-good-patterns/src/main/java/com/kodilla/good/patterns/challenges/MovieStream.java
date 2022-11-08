package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.MovieStore;

import java.util.Map;
import java.util.stream.Collectors;

public class MovieStream {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
        String movies = movieStore.getMovies().entrySet().stream()
                .map(Map.Entry::getValue)
                .flatMap(s->s.stream())
                .collect(Collectors.joining(" ! ","",""));


        System.out.println(movies);
    }



}
