package io.everyonecodes.java.t9_inheritance.exercises.set2.exercise2;

import java.util.List;

public class HouseTornadoClaim extends HouseholdClaim{
    boolean isRoofDamaged;
    String houseClaimName;

    public HouseTornadoClaim(Person person, double estimatedDamagesCost, List<String> damagedItems, boolean isRoofDamaged) {
        super(person, estimatedDamagesCost, damagedItems);
        this.isRoofDamaged = isRoofDamaged;
        this.houseClaimName = "tornado damage claim";
    }

    @Override
    public String generateReport(){
        String report = super.generateReport();

        report += "    Damaged items: " + damagedItems + "\n" +
                "    This is a " + houseClaimName;

        if (isRoofDamaged) {
            report += "\n" + "    Since the roof was damaged, make sure to buy some buckets to prevent future water damage claims";
        }
        return report;
    }
}
