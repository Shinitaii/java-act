import java.io.*;

public class VILORIA_CASTRO_LABACT2_BUFFEREDREADER {
    
    public static void main(String [] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String lines = "===================================="; //for organizing

        //this starts the program
        System.out.println(lines + "\nWelcome to Viloria & Castro Dairy Farms\n" + lines);
        System.out.print("Enter number of eggs: ");
        int amount = Integer.parseInt(scan.readLine()); 
        System.out.printf(lines + "\nYou ordered %,d eggs.\n", amount);
        int dozen = amount/12;
        int loose = amount%12;
        System.out.printf("No. of dozen: %,d at Php 36.00 per dozen.\n", dozen);
        System.out.printf("No. of loose eggs: %,d at Php 4.75 each.\n", loose);
        double total = (dozen * 36) + (loose * 4.75);
        System.out.printf(lines + "\nYour total amount due is: Php %,.2f\n" + lines, total);
        scan.close();
    }

}