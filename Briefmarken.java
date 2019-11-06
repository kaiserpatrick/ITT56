import java.util.Scanner;

public class Briefmarken {
    public static void main( String args[]) {
        // Variablen definieren
        // Scanner initialisieren
        Scanner scan = new Scanner(System.in);
        int centBetrag;

        // Userabfrage zu den Cent Betrag
        System.out.print("Bitte den Cent Betrag eingeben: ");
        // einlesen in die Variable centBetrag
        centBetrag = scan.nextInt();

        // Scanner schliessen
        scan.close();

        // pruefen ob der Betrag 0 zurueckgibt, nur dann kann das Programm die Werte ausgeben
        if(centBetrag % 10 == 0){
            System.out.println("\t50 Cent\t20 Cent\t10 Cent");

            // Wie oft passt die fuenfzig in den centBetrag rein
            for(int fuenfzig = 0; fuenfzig <= centBetrag / 50; fuenfzig++){

                // Wie oft passt die zwanzig in den centBetrag rein
                for(int zwanzig = 0; zwanzig <= centBetrag / 20; zwanzig++) {

                    // Wie oft passt die zehn in den centBetrag rein
                    for(int zehn = 0; zehn <= centBetrag / 10; zehn++) {

                        // pruefen ob die durchgelaufenen Schleifen mal ihren Wert der eingegebene Wert ist
                        if((fuenfzig * 50) + (zwanzig * 20) + (zehn * 10) == centBetrag) {
                            System.out.println("\t" + fuenfzig + "\t" + zwanzig + "\t" + zehn);
                        }
                    }
                }
            }
        } else {
            System.out.println("Es gibt keine Loesung!");
        }
    }
}