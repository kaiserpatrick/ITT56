class Student {
    // Instanzvariablen: jeder Studengt besitzt seine eigenen
    private String name;
    private int nummer;

    // Klassenvariable: ein Zaehler für unabhaengig von der Existenz
    //                  eines Objektes
    private static int zaehler;

    Student() {}

    public Student(String vorname,  int nummer) {
        setName(this.name);
        setNummer(this.nummer);
    }

    // Instanzmethoden: jeder Student kann auf (quasi) eigene Fähigkeiten
    //                  vertrauen
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNummer() {
        return this.nummer;

    }

    // Matrikelnummer setzen ohne Prüfung der Bedingung
    public void setNummer(int n) { 
        int alteNummer = this.nummer; 
        this.nummer = n;
         
        if (!validateNummer()) { // neue Nummer ist nicht gueltig
            this.nummer = alteNummer; 
        } 
    } 

    // diese Methode wird in setNummer zur Prüfung verwendet 
    private boolean validateNummer() {
        return (this.nummer >= 10000 && this.nummer <= 99999 && this.nummer % 2 != 0);
    }

    public String toString() {
        return name + " (" + nummer + ") ";
    }

    // default-Konstruktor automatisch vorhanden, solange kein anderer
    // Konstruktor geschrieben wurde
    // prinzipiell: Student(){  }

    // Instanzmethoden: jeder Student kann auf (quasi) eigene Fähigkeiten
    //                  vertrauen

    public static int getZaehler() {
        return zaehler;
    }

    public static Student createStudent() {
        zaehler++;
        return new Student();
    }


}