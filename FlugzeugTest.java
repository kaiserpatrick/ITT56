class FlugzeugTest {
    public static void main(String[] args) {
        Flugzeug flug1 = new Flugzeug("Boeing", 950, 1);

        flug1.setImmatNummer("123456");

        System.out.println("Immat. Nummer: " + flug1.getImmatNummer());
        System.out.println("Schafft Looping: " + flug1.getLooping());
        System.out.println("Maximale Geschwindigkeit: " + flug1.getMaxSpeed());
    }
}