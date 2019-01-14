package Chapter7;

public class ex7_71 {
    public static void main(String[] args) {
        Printer laserPrinter = new Printer(100,true);
        Printer simplePrinter = new Printer(100, false);

        laserPrinter.print(20,true);
        laserPrinter.print(10);
        System.out.println("Remaining toner = " + laserPrinter.getTonerLevel());
        System.out.println("Total amount of pages printed = "+ laserPrinter.getPagesPrinted());
        laserPrinter.print(80);
        laserPrinter.refillToner();
        laserPrinter.print(80);
        simplePrinter.print(10, true);
        simplePrinter.print(10);
    }
}
