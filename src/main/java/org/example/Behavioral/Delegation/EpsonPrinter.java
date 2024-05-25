package org.example.Behavioral.Delegation;

import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;

public class EpsonPrinter implements Printer{

    private static final Logger LOGGER = getLogger(String.valueOf("EpsonPrinter"));
    @Override
    public void print(String message) {
        LOGGER.info("Epson Printer : " + message);
    }
}
