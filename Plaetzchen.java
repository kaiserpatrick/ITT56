class Plaetzchen {

    // Instanzvariablen
    String sorte, groesse, form;
    // weitere Instanzvariablen hier
    boolean verzierungJaNein;


    // Instanzmethode
    public void ausgeben() {
        // gibt Informationen über die Plätzchen aus z.B.
        // Sorte Kokos, Groesse mittel, Form rund
        String jaNein;

        if(!verzierungJaNein){
            jaNein = "nein";
        } else {
            jaNein = "ja";
        }

        System.out.println("Sorte " + sorte + ", Groesse " + groesse + ", Form " + form + ", Verzierung " + jaNein);
    }

    // Test der Klasse Plaetzchen
    public static void main(String[] args) {
        /*
            (1) Erzeugen Sie mit dem new-Operator ein Objekt der Klasse Plaetzchen.
                Plaetzchen plaetzchen1 = new Plaetzchen(); // Der Standardkonstruktor wird von Java zur Verfügung gestellt.
            (2) Weisen Sie über die Punktnotation referenzvariable.instanzvariable
                den Instanzvariablen des Objekts Werte zu.
            (3) Lassen Sie dann das Plaetzchen-Objekt seine Methode ausgeben() aufrufen.
            (4) Testen Sie Ihr Programm.
            (5) Erzeugen Sie zwei weitere Plaetzchen-Objekte und verfahren Sie wie oben.
        */

        Plaetzchen plaetzchen1 = new Plaetzchen();
        Plaetzchen plaetzchen2 = new Plaetzchen();
        Plaetzchen plaetzchen3 = new Plaetzchen();

        plaetzchen1.sorte = "Kokos";
        plaetzchen1.groesse = "mittel";
        plaetzchen1.form = "rund";
        plaetzchen1.verzierungJaNein = false;

        plaetzchen2.sorte = "Affennuss";
        plaetzchen2.groesse = "klein";
        plaetzchen2.form = "rund";
        plaetzchen2.verzierungJaNein = false;

        plaetzchen3.sorte = "Honigkuchen";
        plaetzchen3.groesse = "gross";
        plaetzchen3.form = "rechteckig";
        plaetzchen3.verzierungJaNein = true;

        System.out.println("+++ Plaetzchenliste +++\n");
        plaetzchen1.ausgeben();
        plaetzchen2.ausgeben();
        plaetzchen3.ausgeben();
    }
}