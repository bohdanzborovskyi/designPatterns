package org.example.Behavioral.Delegation;

import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;

public class HPPrinter implements Printer{

    private static final Logger LOGGER = getLogger(String.valueOf("HPPrinter"));
    @Override
    public void print(String message) {
        LOGGER.info("HP Printer : " + message);
    }
}
