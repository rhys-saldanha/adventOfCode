package org.rhyssaldanha.adventOfCode;

import org.rhyssaldanha.adventOfCode.puzzle.Day3;
import org.rhyssaldanha.adventOfCode.puzzle.Puzzle;
import org.rhyssaldanha.adventOfCode.util.FileParser;

import java.nio.file.Paths;
import java.util.function.Supplier;

public class Main {
    private static final Supplier<Puzzle> puzzle = Day3::new;
    private static final String file = "day3.txt";

    public static void main(String[] args) {
        final var lines = new FileParser().getLines(Paths.get("src", "main", "resources", file));
        final String answer = puzzle.get().run(lines);
        System.out.println(answer);
    }
}
