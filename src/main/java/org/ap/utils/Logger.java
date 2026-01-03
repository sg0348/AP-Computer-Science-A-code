package org.ap.utils;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Logger {
    public static String setTime()
    {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String timestamp = null;
        try {
            timestamp = now.format(formatter);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return timestamp;
    }
    public static void info(String message)
    {
        System.out.print(setTime());
        System.out.print("[INFO]");
        System.out.println(message);
    }
    public static void warn(String message)
    {
        System.out.print(setTime());
        System.out.print("[WARN]");
        System.out.println(message);
    }
    public static void error(String message)
    {
        System.out.print(setTime());
        System.out.print("[ERROR]");
        System.out.println(message);
    }
}
