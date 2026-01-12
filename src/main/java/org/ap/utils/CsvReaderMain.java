package org.ap.utils;

public class CsvReaderMain {

         public static void main(String[] args) {
            CSVReader csvReader = new CSVReader("/Users/srishtiganesh/test/grades.csv");
            String[][] entries = csvReader.readAll();
            System.out.println(entries);
        }
}
