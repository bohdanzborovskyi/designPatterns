package org.example.Behavioral.Delegation;

public class Example {

    public static final String MESSAGE_TO_PRINT = "hello world";

    /**
     * Program entry point
     *
     * @param args command line args
     */
    public static void main(String[] args) {
        PrinterController hpPrinterController = new PrinterController(new HPPrinter());
        PrinterController canonPrinterController = new PrinterController(new CanonPrinter());
        PrinterController epsonPrinterController = new PrinterController(new EpsonPrinter());

        hpPrinterController.print(MESSAGE_TO_PRINT);
        canonPrinterController.print(MESSAGE_TO_PRINT);
        epsonPrinterController.print(MESSAGE_TO_PRINT);
    }
}
