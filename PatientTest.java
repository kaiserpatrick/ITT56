import java.util.Scanner;

class PatientTest {
        public static void main(final String[] args) {
            Scanner scan = new Scanner(System.in);
            String name, vorname;
            int alter, eingabe, i, gAlter = 0;
            double avgAlter = 0.0;

            /*
             * System.out.print("Bitte geben Sie den Vornamen ein: "); vorname =
             * scan.nextLine(); System.out.print("Bitte geben Sie den Nachnamen ein: ");
             * name = scan.nextLine(); System.out.print("Bitte geben Sie das Alter ein: ");
             * alter = scan.nextInt(); scan.close();
             * 
             * Patient patient1 = new Patient(name, vorname, alter);
             */

            System.out.println("Wie viele Patienten sollen angelegt werden?");
            System.out.print("Eingabe: ");
            eingabe = scan.nextInt();

            scan.close();

            Patient[] patient = new Patient[eingabe];

        for(i = 0; i < eingabe; i++) {
            scan = new Scanner(System.in);
            System.out.print("Bitte geben Sie den Vornamen ein: ");
            vorname = scan.nextLine();

            System.out.print("Bitte geben Sie den Nachnamen ein: ");
            name = scan.nextLine();

            System.out.print("Bitte geben Sie das Alter ein: ");
            alter = scan.nextInt(); 

            patient[i] = new Patient(name, vorname, alter);
            patient[i].setPatientNr();
        }

        scan.close(); 

        i = 0;

        System.out.println("===========================");
        System.out.println("Ausgabe der Patienten Daten");

        while(i < eingabe){
            System.out.println(patient[i]);
            gAlter = gAlter + patient[i].getAlter();
            i++;
        }

        avgAlter = (double) gAlter / (double) eingabe;
        System.out.println("Durchschnittsalter: " + avgAlter);       
    }
}