package io.everyonecodes.java.t9_inheritance.exercises.set2.exercise2;

public abstract class Claim {
    Person person;

    double estimatedDamagesCost;

    public Claim(Person person, double estimatedDamagesCost) {
        this.person = person;
        this.estimatedDamagesCost = estimatedDamagesCost;
    }

    public String generateReport(){
        String report = "Report for: " + person.firstName + " " + person.lastName + ", policy number " + person.policyNumber + "\n"+
                "    Estimated cost of damages: " + estimatedDamagesCost +"\n";


        return report;

    }

}
