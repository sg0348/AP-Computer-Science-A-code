package org.ap.utils;

public class GradesMain {
    public static void main(String [] args) {
        String[] gradeKeyHeaders = {"category", "weightage"};
        CSVRecord csvRecord = new CSVRecord(gradeKeyHeaders, "homework,15");
        GradeKey gradeKey = new GradeKey(csvRecord);
        System.out.println(gradeKey.getCategory());
        System.out.println(gradeKey.getWeightage());
        String[] gradeHeaders = {"category", "assignment", "percentage"};
        CSVRecord csvRecord1 = new CSVRecord(gradeHeaders, "homework, chapter 7, 95");
        Grade grade = new Grade(csvRecord1);
        System.out.println(grade.getCategory());
        System.out.println(grade.getAssignment());
        System.out.println(grade.getPercentage());
    }
}
