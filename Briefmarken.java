import java.util.Scanner;

public class Briefmarken {
    public static void main( String args[]) {
        Scanner scan = new Scanner(System.in);
        int centBetrag;

        System.out.print("Bitte den Cent Betrag eingeben: ");
        centBetrag = scan.nextInt();

        if(centBetrag % 10 == 0){
            System.out.println("\t50 Cent\t20 Cent\t10 Cent");

            for(int fuenfzig = 0; fuenfzig <= centBetrag / 50; fuenfzig++){
                for(int zwanzig = 0; zwanzig <= centBetrag / 20; zwanzig++) {
                    for(int zehn = 0; zehn <= centBetrag / 10; zehn++) {
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