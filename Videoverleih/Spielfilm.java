package Videoverleih;

class Spielfilm extends Videoband {
    String  regisseur;     // Name des Regisseurs
    String  bewertung;     // G, PG, R, oder X
  
    // Konstruktor
    public Spielfilm(String ttl, int len, String reg, String bew) {
      super(ttl, len); // den Konstruktor der Superklasse verwenden
      regisseur = reg;   // initialisieren, was in Spielfilm neu ist
      bewertung = bew;
    }
  
    public Spielfilm(String ttl, String reg, String bew) {
      super(ttl); // den Konstruktor der Superklasse verwenden
      regisseur = reg;   // initialisieren, was in Spielfilm neu ist
      bewertung = bew;
    }
  
    // der Klasse Spielfilm hinzugefügt
    public void anzeigen() {
      // System.out.println(titel + ", " + laenge + " Min. verfuegbar:" + vorhanden);
      super.anzeigen(); // Die Subklasse erbt die Methode von der Superklasse
                        // Der Code muss nicht mehrmals geschrieben werden 
      System.out.println("Regisseur: " + regisseur + "  " + bewertung);
    }
  }