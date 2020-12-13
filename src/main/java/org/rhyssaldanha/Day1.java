package org.rhyssaldanha;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Day1 implements Day {
    private static final Integer SUM_TARGET = 2020;

    @Override
    public String run(final List<String> input) {
        final var numbers = input.stream()
                .map(Integer::valueOf)
                .collect(toList());

        for (final Integer x : numbers) {
            for (final Integer y : numbers) {
                if (x + y == SUM_TARGET) {
                    return String.valueOf(x * y);
                }
            }
        }
        throw new IllegalArgumentException("no answer found");
    }
}
