package org.rhyssaldanha.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FileParserTest {

    private FileParser fileParser;

    @BeforeEach
    void setUp() {
        fileParser = new FileParser();
    }

    @Test
    @DisplayName("given path get file lines")
    void linesByString() {
        final List<String> lines = fileParser.getLines(Paths.get("src", "test", "resources", "testInput.txt"));

        assertThat(lines, contains("1652", "1998", "1677"));
    }

    @Test
    void noFile() {
        assertThrows(NoSuchFileException.class, () -> fileParser.getLines(Paths.get("does", "not", "exist")));
    }
}