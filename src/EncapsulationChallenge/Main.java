package EncapsulationChallenge;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, 0, true);

        System.out.println(printer.getTonerLevel());
        printer.fillToner(10);
        printer.fillToner(99);

        System.out.println("num of pages = " + printer.getNumberOfPagesPrinted());
        printer.printPage(10);
        System.out.println("new num of pages = " + printer.getNumberOfPagesPrinted());

    }
}
