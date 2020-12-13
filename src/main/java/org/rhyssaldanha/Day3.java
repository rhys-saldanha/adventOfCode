package org.rhyssaldanha;

import java.util.List;

public class Day3 implements Day {
    private static final char TREE = '#';
    private static final char OPEN = '.';

    @Override
    public String run(final List<String> input) {
        final var rows = input.size();
        final var width = input.get(0).length();

        var x = 0;
        var y = 0;
        var count = 0;

        while (y < rows) {
            final var spot = input.get(y).charAt(x % width);
            if (spot == TREE) {
                ++count;
            }
            x += 3;
            y += 1;
        }

        return String.valueOf(count);
    }
}
