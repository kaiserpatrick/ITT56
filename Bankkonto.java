class Bankkonto {
    private String besitzer;
    private double kontostand;
    private boolean ueberzogen;

    Bankkonto() {
        this.ueberzogen = false;
    }

    Bankkonto(String besitzer) {
        this.besitzer = besitzer;
        this.ueberzogen = false;
    }

    public void setBesitzer(String besitzer) {
        this.besitzer = besitzer;
    }

    public String getBesitzer() {
        return this.besitzer;
    }

    public double getKontostand() {
        return this.kontostand;
    }

    public boolean istUeberzogen() {
        if(this.kontostand < 0){
            return this.ueberzogen = true;
        } else {
            return this.ueberzogen = false;
        }
    }

    public void einzahlen(double betrag) {
        this.kontostand = this.kontostand + betrag;
        istUeberzogen();
    }

    public void abheben(double betrag) {
        this.kontostand = this.kontostand - betrag;
        istUeberzogen();
    }

    public void ueberweisen(double betrag, Bankkonto empfaenger) {
        this.kontostand = this.kontostand - betrag;
        empfaenger.kontostand = empfaenger.kontostand + betrag;
        istUeberzogen();
    }

    public String toString() {
        String verschluesselterName = " ";
        for(int i = 0; i < this.besitzer.length(); i++) {
            verschluesselterName = verschluesselterName + this.besitzer.charAt(i) + this.besitzer.charAt(i);
        }

        if(!ueberzogen){
            return "Kontoinhaber: " + verschluesselterName + " Kontostand: " + this.kontostand + " nicht ueberzogen!!!";
        } else {
            return "Kontoinhaber: " + verschluesselterName + " Kontostand: " + this.kontostand + " ueberzogen!!!";
        }
    }
}