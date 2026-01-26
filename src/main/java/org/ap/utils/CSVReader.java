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
   // public CSVRecord[] readAll()
    public CSVRecord[] readAll() {
        List<String> nonEmptyRows = readRowsFromFile();
        CSVRecord[] data = new CSVRecord[nonEmptyRows.size()];
        String[] headers= (nonEmptyRows.getFirst()).split(",");
        // 3. Split each line by comma and put it into the 2D array
        for (int i = 0; i < nonEmptyRows.size(); i++) {
            data[i] = new CSVRecord(headers, nonEmptyRows.get(i));
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
            // 2. Check if the line is not empty (and not just spaces)
            if (!line.isBlank()) {
                nonEmptyRows.add(line);
            }
        }
        return nonEmptyRows;
    }
}