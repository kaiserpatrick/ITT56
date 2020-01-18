import java.util.Scanner;

class PatientTest {
        public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name, vorname;
        int alter, eingabe, i, j;
        /* 
        System.out.print("Bitte geben Sie den Vornamen ein: ");
        vorname = scan.nextLine();
        System.out.print("Bitte geben Sie den Nachnamen ein: ");
        name = scan.nextLine();
        System.out.print("Bitte geben Sie das Alter ein: ");
        alter = scan.nextInt();
        scan.close();

        Patient patient1 = new Patient(name, vorname, alter);
        */

        System.out.println("Wie viele Patienten sollen angelegt werden?");
        System.out.print("Eingabe: ");
        eingabe = scan.nextInt();

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
        j = 0;
        while(j < eingabe){
            System.out.println(patient[j]);
            j++;
        }
    }
}