package EncapsulationChallenge;

public class Printer {
    private int tonerLevel = 100;
    private int numberOfPagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean isDuplexPrinter) {
        if(tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public void fillToner(int tonerAmount) {
        if(this.tonerLevel + tonerAmount > 100) {
            System.out.println("Too much toner being added");
        } else {
            this.tonerLevel += tonerAmount;
            System.out.println("Toner added. Toner = " + getTonerLevel());
        }
    }

    public void printPage(int number) {
        this.numberOfPagesPrinted += number;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }
}
