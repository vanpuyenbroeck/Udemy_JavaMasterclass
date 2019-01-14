package Chapter7;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public void refillToner() {
        this.tonerLevel = 100;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public void print(int pages) {
        print(pages,false);
    }

    public void print(int pages, boolean duplex) {
        if (duplex) {
            if (this.duplexPrinter) {
                System.out.println("Printing on both sides");
                printPages(pages);
            } else {
                System.out.println("This printer cannot print on both sides");
            }
        } else {
            printPages(pages);
        }
    }

    private void printPages(int pages) {
        if ((tonerLevel - pages) >= 0) {
            this.pagesPrinted += pages;
            this.tonerLevel = (tonerLevel - pages);
            System.out.println("Printed " + pages + " pages");
        }else{
            System.out.println("Insufficient toner remaining to print " + pages + " pages");
        }
    }
}
