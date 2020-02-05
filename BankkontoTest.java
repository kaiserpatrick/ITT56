class BankkontoTest {
    public static void main(String[] args) {
        Bankkonto konto1 = new Bankkonto();
        Bankkonto konto2 = new Bankkonto("Mueller");

        // Besitzer setzen; Kontostand addieren und subtrahieren; Kontrolle
        konto1.setBesitzer("Meier");
        konto1.abheben(3500.55);
        System.out.println(konto1.toString());
        System.out.println("Kontrolle: " + konto1.getBesitzer() + " " + konto1.getKontostand());
        konto1.einzahlen(4500.99);
        System.out.println(konto1.toString());
        System.out.println("Kontrolle: " + konto1.getBesitzer() + " " + konto1.getKontostand());

        //Kontostand Konto2 ueberweisen
        System.out.println(konto2.toString());
        konto1.ueberweisen(500.50, konto2);
        System.out.println(konto1.toString());
        System.out.println(konto2.toString());
    }
}