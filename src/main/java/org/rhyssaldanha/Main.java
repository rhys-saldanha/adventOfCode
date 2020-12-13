package org.rhyssaldanha;

import org.rhyssaldanha.util.FileParser;

import java.nio.file.Paths;
import java.util.function.Supplier;

public class Main {
    private static final Supplier<Day> puzzle = Day1::new;
    private static final String file = "day1.txt";

    public static void main(String[] args) {
        final var lines = new FileParser().getLines(Paths.get("src", "main", "resources", file));
        final String answer = puzzle.get().run(lines);
        System.out.println(answer);
    }
}
