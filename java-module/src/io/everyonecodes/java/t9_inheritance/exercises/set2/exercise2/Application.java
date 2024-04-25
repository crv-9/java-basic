package io.everyonecodes.java.t9_inheritance.exercises.set2.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        ReportPrinter printer = new ReportPrinter();


        List<Claim> claimList = new ArrayList<>();

        Person examplePerson = new Person("John", "Smith", 5678);

        //household claims
        //fire claim
        claimList.add(new HouseFireClaim(examplePerson, 6000.0, List.of("tv", "microwave", "piano", "couch"), true, "defect in wall socket"));
        //tornado claim
        claimList.add(new HouseTornadoClaim(examplePerson, 12000.0, List.of("kitchen table", "bookshelf", "desk", "bed"), true));

        //vehicle claims
        //normal claim
        claimList.add(new VehicleAccidentClaim(examplePerson, 2000.0, List.of("W1234", "W8790")));
        //personal injury
        claimList.add(new PersonalInjuryVehicleClaim(examplePerson, 80000.0, List.of("W9445", "W3049"), 2));


        // print reports
        printer.printReports(claimList);


    }
}
