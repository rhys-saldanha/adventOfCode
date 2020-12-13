package org.rhyssaldanha;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class Day3Test {

    private Day3 day3;

    @BeforeEach
    void setUp() {
        day3 = new Day3();
    }

    @Test
    void countTrees() {
        final var answer = day3.run(List.of(
                "..##.......",
                "#...#...#..",
                ".#....#..#.",
                "..#.#...#.#",
                ".#...##..#.",
                "..#.##.....",
                ".#.#.#....#",
                ".#........#",
                "#.##...#...",
                "#...##....#",
                ".#..#...#.#"));

        assertThat(answer, is("7"));
    }
}