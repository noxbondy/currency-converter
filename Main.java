import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Currency Converter Apps: ");
        System.out.println("1.Convert SEK To USD");
        System.out.println("2. Convert USD TO SEK");
        System.out.println("3. Convert SEK TO Euro");
        System.out.println("4. Convert Euro TO SEK");
        System.out.println("0. Exit");

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the currency");
        int choice = sc.nextInt();
        double amount;

        switch (choice) {
            case 1:
                System.out.println("Enter Your Amount");
                amount = sc.nextDouble();
                krona(amount);
                return;
            case 2:
                System.out.println("Enter Your Amount");
                amount = sc.nextDouble();
                dollar(amount);
                return;
            case 3:
                System.out.println("Enter Your Amount");
                amount = sc.nextDouble();
                krona3(amount);
                return;
            case 4:
                System.out.println("Enter Your Amount");
                amount = sc.nextDouble();
                euro(amount);
                return;
                case 0:
                    System.exit(0);
                    return;

            default:
                System.out.println("Invalid choice");
        }


    }
    //----SEK to Dollar--1--//
    public static void krona(double amount) {
        System.out.println("1 SEK " + 0.090 + "dollar");
        System.out.println(amount + " SEK = " + (amount * 0.090) + " Dollar");

    }

    //----Dollar to SEk-2--//---
    public static void dollar(double amount) {
        System.out.println("1 Dollar" + 11.16 + "SEK");
        System.out.println(amount + " dollar = " + (11.16 * amount) + " SEK");


    }

    //----SEK to EURO-----3--//-
    public static void krona3(double amount) {
        System.out.println("1 SEK" + 0.87 + "EURO");
        System.out.println(amount + " euro = " + ( 0.87*amount) + " Dollar");


    }
    //-- EURO--to----SEK--4//
    public static void euro(double amount) {
        System.out.println("1 EURO"+ 11.26);
        System.out.println(amount + " EURO = " + (amount*11.26) + " SEK");

    }






}