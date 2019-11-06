import java.util.Scanner;

public class Aufgabe_3_27 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int number;

        System.out.print("Positive ganze Zahl: ");
        number = scan.nextInt();

        scan.close();

        String numberStr = Integer.toString(number);
        String[] numberStrArr = numberStr.split("");

        System.out.print("Zerlegt rueckwaerts: ");
        for(int i = numberStrArr.length - 1; i >= 0; i--){
            switch(numberStrArr[i]){
                case "0":
                    System.out.print("null ");
                    break;
                case "1":
                    System.out.print("eins ");
                    break;
                case "2":
                    System.out.print("zwei ");
                    break;
                case "3":
                    System.out.print("drei ");
                    break;
                case "4":
                    System.out.print("vier ");
                    break;
                case "5":
                    System.out.print("fuenf ");
                    break;
                case "6":
                    System.out.print("sechs ");
                    break;
                case "7":
                    System.out.print("sieben ");
                    break;
                case "8":
                    System.out.print("acht ");
                    break;
                case "9":
                    System.out.print("neun ");
                    break;
            }
        }
    }
}