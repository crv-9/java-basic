package io.everyonecodes.java.consolidations.consolidation1.set2.exercise3.service_classes;

public class TemplateChooser {
    public static String choose(String name){

        if (name.contains("Hokopoko")){
            return "privileged";
        } else if (name.startsWith("Mr.")) {
            return "male";
        } else if (name.startsWith("Mrs.")) {
            return "female";
        } else {return "default";}

    }
}
