package org.rhyssaldanha;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.rhyssaldanha.Day2.Line;

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

        assertThat(line.getLowerBound(), is(1));
        assertThat(line.getUpperBound(), is(3));
        assertThat(line.getLetter(), is("a"));
        assertThat(line.getWord(), is("abcde"));
    }

    @Test
    void validPassword() {
        assertTrue(day2.isValidPassword(new Line(1, 3, "a", "abcde")));
    }

    @Test
    void invalidPasswords() {
        assertAll(
                () -> assertFalse(day2.isValidPassword(new Line(1, 3, "a", "bcde"))),
                () -> assertFalse(day2.isValidPassword(new Line(1, 3, "a", "aaaa")))
        );
    }

    @Test
    void countValidPasswords() {
        final var answer = day2.run(List.of("1-3 a: abcde", "1-3 b: cdefg", "2-9 c: ccccccccc"));
        assertThat(answer, is("2"));
    }
}