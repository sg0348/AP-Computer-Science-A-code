package org.ap.utils;

public class Grade {
    String date;
    String category;
    String assignment;
    double percentage;
    public Grade(CSVRecord csvrecord)
    {
        this.date= csvrecord.get("date");
        this.category = csvrecord.get("category");
        this.assignment = csvrecord.get("assignment");
        String percent = csvrecord.get("score").trim();
        this.percentage = Double.parseDouble(percent);
    }
    public String getDate() {
        return date;
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
