import java.util.Scanner;

public class ArrayResteverfahren {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int[] dual = new int[32];
        int zahl1, i = 0;

        do {
            System.out.print("Gib eine Ganzzahl ein: ");
            zahl1 = scan.nextInt();
        }while(zahl1 <= 0);

        scan.close();

        while(zahl1 > 0) {
            dual[i] = zahl1 % 2;
            zahl1 = (zahl1 - zahl1 % 2) / 2;

            i++;
        }

        for(i = 31; i >= 0; i--) {
            if(i % 4 == 0) {
                if(i == 0) {
                    System.out.print(dual[i]);
                } else {
                    System.out.print(dual[i] + " ");
                }
            } else {
                System.out.print(dual[i]);
            }
        }
    }
}