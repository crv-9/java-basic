package io.everyonecodes.java.evaluations.evaluation1.exercise4.service_classes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class AverageWriter {

    public void write(Path inputPath, Path outputPath) throws IOException {
        List<String> stringList = getAllFileLines(inputPath);

        writeIntoFile(getAveragesStringList(stringList), outputPath);
    }

    public List<String> getAllFileLines(Path filePath) throws IOException{
        return Files.readAllLines(filePath);
    }

    // here I am converting each line into an array. Then convert each item into an int, and with those I create a list - which I return.
    public List<Integer> convertStringIntoListOfInt(String string){
        List<Integer> integerList = new ArrayList<>(List.of());

        // regex \\s+ removes the empty spaces between numbers
        String[] stringArray = string.split("\\s+");

        for (String numberToBe: stringArray) {
            integerList.add(Integer.parseInt(numberToBe));
        }
        return integerList;
    }

    public List<String> getAveragesStringList(List<String> stringList){
        List<String> averagesStringList = new ArrayList<>();

        for (String string: stringList) {
            averagesStringList.add(String.valueOf(calculateAverage(convertStringIntoListOfInt(string))));
        }
        return averagesStringList;
    }

    public double calculateAverage(List<Integer> integerList){
        double sum = 0.0;
        int size = integerList.size();

        for (int number: integerList) {
            sum+= number;
        }
        return sum / size;
    }

    private void writeIntoFile(List<String> averagesStringList, Path outputPath) throws IOException{
        Files.write(outputPath, averagesStringList);
    }
}
