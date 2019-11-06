import java.util.Scanner;

public class Benzinverbrauch {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        final double MSTOKMH = 3.6;
        double geschwindigkeit, geschwindigkeitMeter, verbrauch, liter, zeit;
        int std, min, km;

        System.out.print("Gefahrene Stunden: ");
        std = scan.nextInt();
        System.out.print("Gefahrene Minuten: ");
        min = scan.nextInt();
        System.out.print("Gefahrene Kilometer: ");
        km = scan.nextInt();
        System.out.print("Gebrauchte Liter: ");
        liter = scan.nextDouble();

        scan.close();

        zeit = (std * 60 + min) * 60;
        geschwindigkeitMeter = km * 1000 / zeit;
        geschwindigkeit = geschwindigkeitMeter * MSTOKMH;
        verbrauch = (liter / km) * 100;

        System.out.println("Durchschnittl. Geschwindigkeit: " + geschwindigkeit + " km/h (" + geschwindigkeitMeter + " m/s)");
        System.out.println("Durchschnittl. Benzinverbrauch: " + verbrauch + " l/100km");
    }
}