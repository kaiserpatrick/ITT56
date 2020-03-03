class Flugzeug {
    private String hersteller;      // Steht fuer Herstellername
    private int maxSpeed;           // Steht fuer Max. Geschwindigkeit
    private String immatNummer;     // Steht fuer Immatrikulationsnummer
    private int anzahlFluegel = 1;  //  Steht fuer die Anzahl der Fluegelpaare; mind. 1 Fluegelpaar ... ohne Fluegel waere das Fliegen schwierig

    /* Flugzeug() {} */

    Flugzeug(String hersteller, int maxSpeed, int anzahlFluegel) {
        this.hersteller = hersteller;
        this.maxSpeed = maxSpeed;
        this.anzahlFluegel = anzahlFluegel;
    }

    public String getImmatNummer() {
        return immatNummer;
    }

    void setImmatNummer(String immatNummer) {
        this.immatNummer = immatNummer;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public boolean getLooping() {
        return true;
    };

}