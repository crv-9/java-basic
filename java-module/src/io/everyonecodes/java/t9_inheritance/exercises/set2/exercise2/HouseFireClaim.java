package io.everyonecodes.java.t9_inheritance.exercises.set2.exercise2;

import java.util.List;

public class HouseFireClaim extends HouseholdClaim{
    boolean werePetsHarmed;
    String assumedCause;
    String houseClaimName;

    public HouseFireClaim(Person person, double estimatedDamagesCost, List<String> damagedItems, boolean werePetsHarmed, String assumedCause) {
        super(person, estimatedDamagesCost, damagedItems);
        this.werePetsHarmed = werePetsHarmed;
        this.assumedCause = assumedCause;
        this.houseClaimName = "fire damage claim";
    }

    @Override
    public String generateReport(){
        String report = super.generateReport();

        report += "    Damaged items: " + damagedItems + "\n" +
                "    This is a " + houseClaimName + ". The assumed cause of the fire is: " + assumedCause;

        if (werePetsHarmed){
            report += "\n" + "    Since one or more pets were harmed, an additional bonus of $10 will be awarded.";
        }

        return report;
    }
}
