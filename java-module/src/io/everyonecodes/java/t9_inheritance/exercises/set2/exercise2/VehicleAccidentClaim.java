package io.everyonecodes.java.t9_inheritance.exercises.set2.exercise2;

import java.util.List;

public class VehicleAccidentClaim extends Claim {
    List<String> involvedLicensePlates;
    String claimTypeName;

    public VehicleAccidentClaim(Person person, double estimatedDamagesCost, List<String> involvedLicensePlates) {
        super(person, estimatedDamagesCost);
        this.involvedLicensePlates = involvedLicensePlates;
        this.claimTypeName = "vehicle accident";
    }

    public List<String> getInvolvedLicensePlates() {
        return involvedLicensePlates;
    }

    @Override
    public String generateReport(){
        String report = super.generateReport();

        report += "    This is a " + claimTypeName + "\n" +
        "    License plates of involved vehicles: " + involvedLicensePlates;

        return report;
    }
}
