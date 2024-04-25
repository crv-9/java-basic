package io.everyonecodes.java.t9_inheritance.exercises.set2.exercise2;

import java.util.List;

public class ReportPrinter {
    public static void printReports(List<Claim> claimList){

        for (Claim claim: claimList) {
            System.out.println(claim.generateReport());
        }
    }
}
