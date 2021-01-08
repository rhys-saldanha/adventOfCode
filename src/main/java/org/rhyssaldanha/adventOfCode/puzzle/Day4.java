package org.rhyssaldanha.adventOfCode.puzzle;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

import java.util.List;

public class Day4 implements Puzzle {
    @Override
    public String run(final List<String> input) {
        return null;
    }

    Day4.Passport parsePassport(final String string) {
        return null;
    }

    @Value
    @Builder
    static class Passport {
        @NonNull
        String birthYear;
        @NonNull
        String issueYear;
        @NonNull
        String expirationYear;
        @NonNull
        String height;
        @NonNull
        String hairColour;
        @NonNull
        String eyeColour;
        @NonNull
        String passportId;
        @NonNull
        String countryId;
    }
}
