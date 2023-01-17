public class Main {
    public static void main(String[] args) {
        Währungsrechner dollarRechner = new Währungsrechner(1.08);
        Währungsrechner yenRechner = new Währungsrechner(139.53);
        Währungsrechner dongRechner = new Währungsrechner(25354.13);

        System.out.println( "100 € entspricht: " + dollarRechner.inFremd(100) + " $");
        System.out.println( "100 $ entspricht: " + dollarRechner.inEuro(100)  + " €");
        System.out.println( "100 € entspricht: " + yenRechner.inFremd(100) + " Yen");
        System.out.println( "100 Yen entspricht: " + yenRechner.inEuro(100)  + " €");
        System.out.println( "100 € entspricht: " + dongRechner.inFremd(100) + " Dong");
        System.out.println( "100 Dong entspricht: " + dongRechner.inEuro(100)  + " €");
    }
}
