import java.util.Scanner;

class StudentTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name;
        int matrNr;

        System.out.println("Wie viele Studenten sollen erstellt werden?");
        System.out.print("Eingabe: ");
        int eingabe = scan.nextInt();

        Student[] student = new Student[eingabe];

        for(int i = 0; i < eingabe; i++){
            // Studenten Instanzen erzeugen im Array;
            student[i] = Student.createStudent();
            /*
             * // Scanner neu "anlegen"
             * scan = new Scanner(System.in);
             * 
             * // Studenten Namen und Matrikelnummer geben
             * System.out.println( (i+1) + ". Student");
             * System.out.print("Name eingeben: ");
             * name = scan.nextLine();
             * System.out.print("Matrikelnummer eingeben: ");
             * matrNr = scan.nextInt();
             * 
             * // Name und Matrikelnummer setzen
             * student[i].setName(name);
             * student[i].setNummer(matrNr);
             * 
             * // Zeilenumbruch
             * System.out.println("");
             */
        }

        scan.close();
        /*
         * for(int i = 0; i < eingabe; i++) {
         *  if(i < 9){
         *      System.out.println("0" + (i+1) + ". Student: " + student[i]);
         *  } else {
         *      System.out.println((i+1) + ". Student: " + student[i]);
         *  }
         *  
         * }
         */

        // System.out.println("Studentenzahl: " + student.getZaehler());
    }
}