package io.everyonecodes.java.t5b_files.examples.exercise2.service_classes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameWriterTest {
    NameWriter nameWriter = new NameWriter();
    String stringFilePath = "src/io/everyonecodes/java/t5b_files/examples/exercise2/service_classes/newname.txt";

    @ParameterizedTest
    @CsvSource({
            "Luis",
            "Gerardo"
    })
    void writeOneName(String newName) throws IOException{
        nameWriter.write(newName);
        Path filePath = Path.of(stringFilePath);

        List<String> result = Files.readAllLines(filePath);

        List<String> expected = List.of(newName);

        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "Hannah, Henry",
            "Henry, Lisa"
    })
    void writeOverwriteName(String firstName, String secondName) throws IOException{
        nameWriter.write(firstName);
        nameWriter.write(secondName);
    }

    @BeforeEach
    @AfterEach
    void deleteNewNameFile() throws IOException{
        Path filePath = Path.of(stringFilePath);
        Files.deleteIfExists(filePath);
    }
}
