package org.rhyssaldanha.adventOfCode.puzzle;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class Day4Test {
    @Test
    void parsePassport() {
        final Day4.Passport passport = new Day4().parsePassport("ecl:gry pid:860033327 eyr:2020 hcl:#fffffd byr:1937 iyr:2017 cid:147 hgt:183cm");

        assertThat(passport.getBirthYear(), is("1937"));
        assertThat(passport.getBirthYear(), is("1937"));
        assertThat(passport.getBirthYear(), is("1937"));
        assertThat(passport.getBirthYear(), is("1937"));
        assertThat(passport.getBirthYear(), is("1937"));
        assertThat(passport.getBirthYear(), is("1937"));
        assertThat(passport.getBirthYear(), is("1937"));
        assertThat(passport.getBirthYear(), is("1937"));
    }
}