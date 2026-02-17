package org.ap.utils;

public class GradeFileParser {
    private final String fileName;

    public GradeFileParser(String name) {
        this.fileName = name;
    }

    public Grade[] parseFile() {
        CSVReader csvReader = new CSVReader(fileName);
        CSVRecord[] records = csvReader.readAll();
        Grade[] grades = new Grade[records.length];
        for (int i = 0; i < records.length; i++) {
            grades[i] = new Grade(records[i]);
        }
        return grades;
    }

}


