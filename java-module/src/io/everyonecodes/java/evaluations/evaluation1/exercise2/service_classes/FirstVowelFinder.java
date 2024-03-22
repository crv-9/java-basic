package io.everyonecodes.java.evaluations.evaluation1.exercise2.service_classes;

public class FirstVowelFinder {
    // as per my question during the evaluation: I'm returning a lowercase vowel, regardless of input.
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
