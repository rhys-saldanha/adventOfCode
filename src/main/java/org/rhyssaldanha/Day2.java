package org.rhyssaldanha;

import lombok.Value;
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
        final var matches = StringUtils.countMatches(line.getWord(), line.getLetter());
        return (line.getLowerBound() <= matches) && (matches <= line.getUpperBound());
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
        Integer lowerBound;
        Integer upperBound;
        String letter;
        String word;
    }
}
