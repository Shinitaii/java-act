import javax.swing.JOptionPane;

public class VILORIA_CASTRO_LABACT2_JOPTIONPANE {   
    public static void main(String[] args){
        int amount = Integer.parseInt(JOptionPane.showInputDialog(null, "Welcome to Viloria & Castro Dairy Farms\n"
                    + "\nEnter number of eggs: ", "Input", JOptionPane.QUESTION_MESSAGE));
        int dozen = amount/12;
        int loose = amount%12;
        double total = (dozen * 36) + (loose * 4.75);
        String output = String.format("You ordered %,d eggs.\n\nNo. of dozen: %,d at Php 36.00 per dozen.\n" +
                                    "\nNo. of loose eggs: %,d at Php 4.75 each.\n" + 
                                    "\nYour total amount due is: Php %,.2f\n", amount, dozen, loose, total);
        JOptionPane.showMessageDialog(null, output, "Output", JOptionPane.INFORMATION_MESSAGE);               
    }
    
}
