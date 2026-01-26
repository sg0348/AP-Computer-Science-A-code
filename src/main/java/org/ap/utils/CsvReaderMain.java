package org.ap.utils;

public class CsvReaderMain {

    public static void main(String[] args)
    {
        CSVReader csvReader = new CSVReader("/Users/meera/test/grades.csv");
        try {
            CSVRecord[] records = csvReader.readAll();
            CSVRecord firstRecord = records[0];
            System.out.println(firstRecord.get("Subject"));
        } finally {

        }

    }
}
