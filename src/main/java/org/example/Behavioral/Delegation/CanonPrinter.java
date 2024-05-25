package org.example.Behavioral.Delegation;


import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;

public class CanonPrinter implements Printer{

    private static final Logger LOGGER = getLogger(String.valueOf("CanonPrinter"));
    @Override
    public void print(String message) {
        LOGGER.info("Canon Printer : " + message);
    }
}
