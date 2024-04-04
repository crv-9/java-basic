package io.everyonecodes.java.t7_streams.self_exercises;

import java.util.List;
import java.util.function.Consumer;

public class Self_Exercise1 {
    public static void main(String[] args) {
        List<String> namesList = List.of("name1", "name2", "name3", "name4");

        // followed this video : https://www.youtube.com/watch?v=Lhnjf0RwBt8
        // iterating the list and printing every single element in it
        // 4 methods, each one becoming simpler than the previous one.

        // 1. typical for loops
        for (int i = 0; i < namesList.size(); i++) {
            System.out.println(namesList.get(i));
        }

        for (String name: namesList) {
            System.out.println(name);
        }

        // 2. anonymous class - here we create an anonymous class which will only exist in this place for a specific operation
        namesList.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // 3. lambda expression

        namesList.forEach(str -> System.out.println(str));

        // 4. method reference

        namesList.forEach(System.out::println);

        // method references can replace lambda expressions
    }
}
