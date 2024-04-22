package io.everyonecodes.java.coding_contest.level3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoneyAdminTo100 {
    public static Map<Integer, Integer> getCountOfCoins(List<Integer> currencyList){
        Map<Integer, Integer> currencyFrequencyMap = new HashMap<>();
        for (int i = 1; i < 101; i++) {

            // Key is currency & Value is frequency

            double remaining = i;
            for (int currency: currencyList) {
                if (remaining/currency > 1){
                    currencyFrequencyMap.put(currency, (int)(remaining/currency));
                }
            }
        }
        return currencyFrequencyMap;


    }

}
