package org.rhyssaldanha;

import lombok.Value;
import org.apache.commons.lang3.CharUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.regex.Pattern;

public class Day2 implements Day {
    private static final Pattern LINE_PATTERN = Pattern.compile("(?<lowerBound>\\d+)-(?<upperBound>\\d+)\\s(?<letter>\\w):\\s(?<word>\\w*)");

    @Override
    public String run(final List<String> input) {
        return String.valueOf(input.stream()
                .map(this::parseLine)
                .filter(this::isValidPassword)
                .count());
    }

    boolean isValidPassword(final Line line) {
        final var letter = CharUtils.toChar(line.getLetter());
        final var firstChar = line.getWord().charAt(line.getFirstIndex() - 1);
        final var secondChar = line.getWord().charAt(line.getSecondIndex()-1);
        return (letter == firstChar) ^ (letter == secondChar);
    }

    Line parseLine(final String line) {
        final var matcher = LINE_PATTERN.matcher(line);
        matcher.find();
        return new Line(Integer.valueOf(matcher.group("lowerBound")),
                Integer.valueOf(matcher.group("upperBound")),
                matcher.group("letter"),
                matcher.group("word"));
    }

    @Value
    public static class Line {
        Integer firstIndex;
        Integer secondIndex;
        String letter;
        String word;
    }
}
