package org.ap.utils;

public class GradeKey {
    double weightage;
    String category;
    public GradeKey(CSVRecord csvrecord)
    {
        this.category = csvrecord.get("category");
        String weight = csvrecord.get("weightage");
        this.weightage = Double.parseDouble(weight);
    }

    public String getCategory() {
        return category;
    }
    public double getWeightage() {
        return weightage;
    }
}

