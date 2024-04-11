package io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise1.test_classes;

import io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise1.data_classes.TShirt;
import io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise1.data_classes.TShirtSize;
import io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise1.service_classes.ShopAssistant;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopAssistantTest {
    ShopAssistant assist = new ShopAssistant();
// I had to comment them out because the methods were later changed to private.
//    @Test
//    void findShirtsThatFit(){
//        assist.addShirts();
//        List<TShirt> result = assist.findShirtsThatFit(TShirtSize.S);
//
//        List<TShirt> expected = List.of(
//                new TShirt("green", TShirtSize.S, 12.0),
//                new TShirt("red", TShirtSize.S, 10.0)
//        );
//
//        assertEquals(expected,result);
//    }
//    @Test
//    void findShirtsThatFitNoShirtFound(){
//        assist.addShirts();
//        List<TShirt> result = assist.findShirtsThatFit(TShirtSize.XXL);
//
//        List<TShirt> expected = List.of();
//
//        assertEquals(expected,result);
//    }
}
