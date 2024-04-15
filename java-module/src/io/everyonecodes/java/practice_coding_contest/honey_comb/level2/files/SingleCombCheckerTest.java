package io.everyonecodes.java.practice_coding_contest.honey_comb.level2.files;

import io.everyonecodes.java.practice_coding_contest.honey_comb.level2.SingleCombChecker;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleCombCheckerTest {

    SingleCombChecker checker = new SingleCombChecker();

    List<String> lines = new ArrayList<>(List.of(
            "O-X-X-O-X-","-O-O-O-X-O", "X-O-W-O-O-", "-O-X-X-X-X", "O-X-X-O-O-"
));
    @Test
    void testing(){
        String result = checker.countCombFreeCells(lines);

        assertEquals("4", result);
    }
}
