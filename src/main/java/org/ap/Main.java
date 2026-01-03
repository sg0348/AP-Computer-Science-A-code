package org.ap;

import org.ap.utils.Logger;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        Logger logger = new Logger();
        logger.info("Parsing CSV file");
        logger.warn("Bad corrupt file");
        logger.error("Unable to parse file");

    }
}
