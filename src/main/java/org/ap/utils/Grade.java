package org.ap.utils;

public class Grade {
    String category;
    String assignment;
    double percentage;
    public Grade(CSVRecord csvrecord)
    {
        this.category = csvrecord.get("category");
        this.assignment = csvrecord.get("assignment");
        String percent = csvrecord.get("percentage");
        this.percentage = Double.parseDouble(percent);
    }
    public String getCategory() {
        return category;
    }
    public String getAssignment() {
        return assignment;
    }
    public double getPercentage() {
        return percentage;
    }

}
