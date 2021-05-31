package Encapsulation;

public class Printer {
    private int tonnerLevel ;
    public int printedPages=0;
    private boolean DuplexPrinter;

    public Printer(int tonnerLevel, boolean duplexPrinter) {
        this.tonnerLevel = tonnerLevel;
        this.DuplexPrinter =duplexPrinter;
    }

    public int fillUpTonner(int pages) {
        this.DuplexPrinter = true;
        if (tonnerLevel > 1 && tonnerLevel < 100) {
            this.printedPages=pages;
           pages = pages / 2;
        }
        return pages;
    }
    public int getPrintedPages(int pages){
       if(this.tonnerLevel<=50){
           this.printedPages=pages;
            pages*=2;

       }
       return pages;
    }

    public static void main(String[] args) {
        Printer print= new Printer(55,true);
        int print2=print.fillUpTonner(12);
        int print1=print.fillUpTonner(6);
        System.out.println(print1);
        System.out.println(print2);
    }
    }