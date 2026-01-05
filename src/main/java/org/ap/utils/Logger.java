package org.ap.utils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private final String logFileName;

    public Logger(String fileName) {
        logFileName = fileName;
    }

    public void info(String message) {
        log("[INFO]", message);
    }

    public void warn(String message) {
        log("[WARN]", message);
    }

    public void error(String message) {
        log("[ERROR]", message);
    }

    private void log(String logLevel, String message) {
        String logMessage = getTime() + " " + logLevel + " "+ message+ System.lineSeparator();
        try {
            Files.write(
                    Paths.get(logFileName),
                    logMessage.getBytes(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
    private static String getTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        try {
            return now.format(formatter);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
