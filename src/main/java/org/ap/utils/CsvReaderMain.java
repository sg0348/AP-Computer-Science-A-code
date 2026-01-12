package org.ap.utils;

public class CsvReaderMain {

    static void main () {
        CSVReader csvReader = new CSVReader("/Users/srishtiganesh/test/grades.csv");
        String[][] entries = csvReader.readAll();
        System.out.println(entries);
    }
}
