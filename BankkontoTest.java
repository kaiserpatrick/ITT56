class BankkontoTest {
    public static void main(String[] args) {
        Bankkonto konto1 = new Bankkonto();
        Bankkonto konto2 = new Bankkonto("Mueller");

        // Besitzer setzen; Kontostand addieren und subtrahieren; Kontrolle
        konto1.setBesitzer("Meier");
        konto1.abheben(3000.55);
        System.out.println(konto1.toString());
        System.out.println("Kontrolle: " + konto1.getBesitzer() + " " + konto1.getKontostand());
        
        konto1.einzahlen(4020.20);
        System.out.println(konto1.toString());
        System.out.println("Kontrolle: " + konto1.getBesitzer() + " " + konto1.getKontostand());

        //Kontostand Konto2 ueberweisen
        konto1.ueberweisen(555.55, konto2);
        System.out.println(konto1.toString());
        System.out.println(konto2.toString());
    }
}