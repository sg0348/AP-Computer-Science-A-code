package org.ap.utils;

public class GradesMain {
    public static void main(String [] args) {
        GradeKeyFileParser parser = new GradeKeyFileParser("/Users/meera/test/calculus_grade_key.csv");
        GradeKey[] gradeKeys = parser.parseFile();
        for (GradeKey g : gradeKeys) {
            System.out.println("Category: " + g.getCategory() + " Weight: " + g.getWeightage() + "%");
        }
        GradeFileParser parse = new GradeFileParser("/Users/meera/test/calculus_grades.csv");
        Grade[] grades = parse.parseFile();
        for (Grade g : grades) {
            System.out.println("Date: "+g.getDate()+" Category: " + g.getCategory() +" Assignment: "+ g.getAssignment()+ " Score: " + g.getPercentage() + "%");
        }
    }
}
