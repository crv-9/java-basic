package io.everyonecodes.java.evaluations.evaluation1.exercise2.service_classes;

public class Application {
    public static void main(String[] args) {
        System.out.println(find("ROBERTO"));
    }

    public static String find(String string){
        String stringLower = string.toLowerCase();
        if (!string.isEmpty()){
            for (Character character: stringLower.toCharArray()) {
                if (character.equals('a') || character.equals('e') || character.equals('i') || character.equals('o') || character.equals('u')){
                    return character.toString();
                }
            }
        }
        return "";
    }
}
