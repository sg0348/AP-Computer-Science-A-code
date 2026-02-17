package org.ap.utils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    private final String csvFileName;
    public CSVReader(String fileName) {
        csvFileName = fileName;
    }
    public CSVRecord[] readAll() {
        List<String> nonEmptyRows = readRowsFromFile();
        if (nonEmptyRows.isEmpty()||nonEmptyRows.size()==1) {
            return new CSVRecord[0];
        }
        CSVRecord[] data = new CSVRecord[nonEmptyRows.size()-1];
        String[] headers= (nonEmptyRows.getFirst()).split(",");
        for (int i = 0; i < headers.length; i++) {
            headers[i] = headers[i].trim();}
        for (int i = 1; i < nonEmptyRows.size(); i++) {
            data[i-1] = new CSVRecord(headers, nonEmptyRows.get(i));
        }
        return data;
    }

    private List<String> readRowsFromFile() {
        List<String> allRows;
        try {
            allRows = Files.readAllLines(Path.of(csvFileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<String> nonEmptyRows = new ArrayList<>();
        for (String line : allRows) {
            if (!line.isBlank()) {
                nonEmptyRows.add(line);
            }
        }
        return nonEmptyRows;
    }
}