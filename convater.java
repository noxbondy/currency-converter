import java.util.Scanner;

public class convater {
    public static void main(String[] args) {
        System.out.println("Currency Converter Apps: ");
        System.out.println("1. Convert SEK To USD");
        System.out.println("2. Convert USD TO SEK");
        System.out.println("3. Convert SEK TO Euro");
        System.out.println("4. Convert Euro TO SEK");
        System.out.println("0. Exit");

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the currency");
        int choice = sc.nextInt();
        System.out.println("Enter Your Amount");
        double amount = sc.nextDouble();

        switch (choice) {
            case 1:
                krona(amount);
                break;
            case 2:
                dollar(amount);
                break;
            case 3:
                krona3(amount);
                break;
            case 4:
                euro(amount);
                break;

                case 0:
                  System.exit(0);

            default:
                System.out.println("Invalid choice");
        }


    }
//----SEK to Dollar--1--//
    public static void krona(double amount) {
        System.out.println("1 SEK " + 0.090 + "dollar");
        System.out.println();
        System.out.println(amount + " SEK = " + (amount * 0.090) + " Dollar");
        System.out.println();
    }

//----Dollar to SEk-2--//---
    public static void dollar(double amount) {
        System.out.println("1 Dollar" + 11.16 + "SEK");
        System.out.println();
        System.out.println(amount + " dollar = " + (11.16 * amount) + " SEK");
        System.out.println();

    }

//----SEK to EURO-----3--//-
    public static void krona3(double amount) {
        System.out.println("1 SEK" + 0.87 + "EURO");
        System.out.println();
        System.out.println(amount + " SEK = " + ( 0.87*amount) + " EURO");
        System.out.println();

    }
    //-- EURO--to----SEK--4//
    public static void euro(double amount) {
        System.out.println("1 EURO"+ 11.26);
        System.out.println();
        System.out.println(amount + " EURO = " + (amount*11.26) + " SEK");
        System.out.println();
    }




}