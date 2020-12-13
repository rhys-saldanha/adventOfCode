package org.rhyssaldanha;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Value;
import lombok.experimental.FieldDefaults;

import java.util.List;

public class Day3 implements Day {
    private static final char TREE = '#';

    private final List<Slope> slopes = List.of(new Slope(3, 1));

    @Override
    public String run(final List<String> input) {
        var total = slopes.stream()
                .mapToInt(slope -> takeSlope(input, slope))
                .reduce(Math::multiplyExact)
                .orElseThrow();
        return String.valueOf(total);
    }

    private int takeSlope(final List<String> input, final Slope slope) {
        final var rows = input.size();
        final var width = input.get(0).length();

        var coord = new Coord(0, 0);
        var count = 0;

        while (coord.getY() < rows) {
            final var spot = input.get(coord.getY()).charAt(coord.getX() % width);
            if (spot == TREE) {
                ++count;
            }
            coord = slope.move(coord);
        }
        return count;
    }

    @FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
    @AllArgsConstructor
    private static class Slope {
        int right;
        int down;

        public Coord move(final Coord initial) {
            return new Coord(initial.getX() + right, initial.getY() + down);
        }
    }

    @Value
    private static class Coord {
        int x;
        int y;
    }
}
