class Spiel
{
    Spiel()
    {
    }

    void rateEinmal()
    {
        System.out.println("Wie viel ist " + zufallszahl(10) + " + " + zufallszahl(10) + "?");
        leseZahl();
        System.out.println("Das Ergebnis war " + (zufallszahl(10) + zufallszahl(10)) );
    }

    int zufallszahl(int n)
    {
        return new java.util.Random().nextInt(n);
    }

    int leseZahl()
    {
        return new java.util.Scanner(System.in).nextInt();
    }

}
