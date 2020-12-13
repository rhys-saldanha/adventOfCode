package org.rhyssaldanha;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class Day1Test {

    private Day1 day1;

    @BeforeEach
    void setUp() {
        day1 = new Day1();
    }

    @Test
    void sumAndMultiply() {
        List<String> lines = List.of("1362", "658");
        final var answer = day1.run(lines);

        assertThat(answer, is("896196"));
    }

    @Test
    void redHerrings() {
        List<String> lines = List.of("295", "1094", "1362", "464", "658");
        final var answer = day1.run(lines);

        assertThat(answer, is("896196"));
    }
}