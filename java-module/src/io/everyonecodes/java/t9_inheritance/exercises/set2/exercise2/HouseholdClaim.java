package io.everyonecodes.java.t9_inheritance.exercises.set2.exercise2;

import java.util.List;

public class HouseholdClaim extends Claim{

    List<String> damagedItems;
    String claimTypeName;

    public HouseholdClaim(Person person, double estimatedDamagesCost, List<String> damagedItems) {
        super(person, estimatedDamagesCost);
        this.damagedItems = damagedItems;
        this.claimTypeName = "household claim";
    }
}
