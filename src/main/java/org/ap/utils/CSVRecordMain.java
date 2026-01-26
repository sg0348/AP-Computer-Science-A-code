package org.ap.utils;

public class CSVRecordMain
{
    public static void main(String[] args)
    {
        String[] headers={"Subject", "Type of assignment", "grade"};
        CSVRecord run = new CSVRecord(headers,"AP Physics 1, Homework, 95");
        String s=run.get("Subject");
        System.out.println(s);
    }
}
