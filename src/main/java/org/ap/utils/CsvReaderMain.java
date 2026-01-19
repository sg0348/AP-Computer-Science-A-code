package org.ap.utils;

public class CsvReaderMain {

    public static void main(String[] args)
    {
        CSVReader csvReader = new CSVReader("/Users/meera/test/grades.csv");
        try{
            String[][] array1 = csvReader.readAll();
            for (String[] strings : array1)
            {
                for (String string : strings) System.out.print(string + " ");
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
