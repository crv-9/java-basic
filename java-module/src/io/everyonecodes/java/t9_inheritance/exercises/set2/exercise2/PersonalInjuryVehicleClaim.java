package io.everyonecodes.java.t9_inheritance.exercises.set2.exercise2;

import java.util.List;

public class PersonalInjuryVehicleClaim extends VehicleAccidentClaim{
    int numberOfDeceasedPeople;

    public PersonalInjuryVehicleClaim(Person person, double estimatedDamagesCost, List<String> involvedLicensePlates, int numberOfDeceasedPeople) {
        super(person, estimatedDamagesCost, involvedLicensePlates);
        this.numberOfDeceasedPeople = numberOfDeceasedPeople;
    }

    public int getNumberOfDeceasedPeople() {
        return numberOfDeceasedPeople;
    }

    @Override
    public String generateReport(){
        String report = super.generateReport();

        report += "\n" + "    Unfortunately, some people were injured in this accident. Number of people who died in the accident: " + numberOfDeceasedPeople;

        return report;
    }
}
