package org.rhyssaldanha.util;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FileParser {

    @SneakyThrows
    public List<String> getLines(final Path path) {
        return Files.lines(path).collect(toList());
    }
}
