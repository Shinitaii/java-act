import java.util.Scanner;

public class VILORIA_CASTRO_LABACT2_SCANNER {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String lines = "===================================="; //for organizing

        //this starts the program
        System.out.println(lines);
        System.out.println("Welcome to Dizon Dairy Farms");
        System.out.println(lines);
        System.out.print("Enter number of eggs: ");
        int amount = scan.nextInt(); 
        System.out.println(lines);
        System.out.printf("You ordered %,d eggs.\n", amount);
        int dozen = amount/12;
        int loose = amount%12;
        System.out.printf("No. of dozen: %,d at Php 36.00 per dozen.\n", dozen);
        System.out.printf("No. of loose eggs: %,d at Php 4.75 each.\n", loose);
        System.out.println(lines);
        double total = (dozen * 36) + (loose * 4.75);
        System.out.printf("Your total amount due is: Php %,.2f\n", total);
        System.out.println(lines);
        scan.close();
    }

}