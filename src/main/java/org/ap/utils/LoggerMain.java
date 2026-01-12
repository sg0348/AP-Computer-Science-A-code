package org.ap.utils;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LoggerMain {
    public static void main(String[] args)
    {
        Logger logger = new Logger("/Users/srishtiganesh/logs/out.log");
        logger.info("Parsing CSV file");
        logger.warn("Bad corrupt file");
        logger.error("Unable to parse file");
    }
}
