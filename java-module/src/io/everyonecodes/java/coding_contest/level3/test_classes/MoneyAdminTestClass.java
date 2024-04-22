package io.everyonecodes.java.coding_contest.level3.test_classes;

import io.everyonecodes.java.coding_contest.level3.MoneyAdminTo100;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MoneyAdminTestClass {
    MoneyAdminTo100 adminTo100 = new MoneyAdminTo100();

    @Test
    void test(){
        System.out.println(adminTo100.getCountOfCoins(List.of(1, 2, 6, 9, 14)));
    }
}
