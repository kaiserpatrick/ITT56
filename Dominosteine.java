public class Dominosteine {
    public static void main(String args[]) {
        int innen, aussen;

        System.out.println("Dominosteine");
        System.out.println("============");
        System.out.println();

        for(aussen = 0; aussen <= 6; aussen++) {
            for(innen = aussen; innen <= 6; innen++) {
                System.out.print("\t+---+---+");
            }
            System.out.println();

            for(innen = aussen; innen <= 6; innen++) {
                System.out.print("\t| " + aussen + " | " + innen + " |");
            }
            System.out.println();
            
            for(innen = aussen; innen <= 6; innen++) {
                System.out.print("\t+---+---+");                
            }
            System.out.println();
        }
    }
}