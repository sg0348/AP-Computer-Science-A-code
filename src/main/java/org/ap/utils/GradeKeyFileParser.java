package org.ap.utils;

public class GradeKeyFileParser {
    private final String fileName;

    public GradeKeyFileParser(String name) {
        this.fileName = name;
    }

    public GradeKey[] parseFile() {
        CSVReader csvReader = new CSVReader(fileName);
        CSVRecord[] records = csvReader.readAll();
        GradeKey[] gradeKeys = new GradeKey[records.length];
        for (int i = 0; i < records.length; i++) {
            gradeKeys[i] = new GradeKey(records[i]);
        }
        return gradeKeys;
    }

}



