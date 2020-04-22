class Videoband {
  String   titel;        // Titel des Videos
  int      laenge;       // Anzahl der Minuten
  boolean  vorhanden;    // ist das Video vorhanden?

  // Konstruktor
  public Videoband(String ttl) {
    titel = ttl; laenge = 90; vorhanden = true;
  }

  // Konstruktor
  public Videoband(String ttl, int len) {
    titel = ttl; laenge = len; vorhanden = true;
  }

  public void anzeigen() {
    System.out.println(titel + ", " + laenge + " Min. verfuegbar: " + vorhanden);
  }

}

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

class VideoVerleih {
  public static void main ( String args[] ) {
    Videoband   artikelA = new Videoband("Microcosmos", 90 );
    Spielfilm   artikelB = new Spielfilm("Jaws", 120, "Spielberg", "PG" );
    artikelA.anzeigen();
    artikelB.anzeigen();

  }
}