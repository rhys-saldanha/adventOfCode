package org.rhyssaldanha.adventOfCode.puzzle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.rhyssaldanha.adventOfCode.puzzle.Day2.Line;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Day2Test {

    private Day2 day2;

    @BeforeEach
    void setUp() {
        day2 = new Day2();
    }

    @Test
    void parseLine() {
        final Line line = day2.parseLine("1-3 a: abcde");

        assertThat(line.getFirstIndex(), is(1));
        assertThat(line.getSecondIndex(), is(3));
        assertThat(line.getLetter(), is("a"));
        assertThat(line.getWord(), is("abcde"));
    }

    @Test
    void passwordValidity() {
        assertAll(
                () -> assertTrue(day2.isValidPassword(new Line(1, 3, "a", "abcde"))),
                () -> assertFalse(day2.isValidPassword(new Line(1, 3, "b", "cdefg"))),
                () -> assertFalse(day2.isValidPassword(new Line(1, 3, "c", "ccccccccc")))
        );
    }

    @Test
    void countValidPasswords() {
        final var answer = day2.run(List.of("1-3 a: abcde", "1-3 b: cdefg", "2-9 c: ccccccccc"));
        assertThat(answer, is("1"));
    }
}