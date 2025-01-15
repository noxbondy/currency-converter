import java.util.Scanner;
public class convater {
    public static void main(String[] args) {
        System.out.println("1 Krona");
        System.out.println("2 Dollar");
        System.out.println("3 Euro");

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the currency");
        int choice = sc.nextInt();

        double amount = sc.nextDouble();

        double euro = sc.nextDouble();

        switch (choice) {
            case 1:
                krona(amount);
                break;
                case 2:
                    krona(amount);
                    break;
                    case 3:
                        krona(amount);
                        break;
        }


    }
    public static void krona(double amount) {
        System.out.println("1 krona " + 0.090+ "dollar");
        System.out.println();

        System.out.println(amount+" krona = " + (amount*0.090) + " Dollar");
        System.out.println();

        System.out.println(amount+" krona = " + (amount*0.086) + " Euro");
        System.out.println();


    }
    public static void dollar(double amount) {
        System.out.println("1 Dollar");
        System.out.println();
        System.out.println(amount+" dollar = " + (amount*0.086) + " Euro");
        System.out.println();


    }
}