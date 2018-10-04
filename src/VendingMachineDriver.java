import javax.swing.*;

public class VendingMachineDriver {
    public static void main(String[] args) {
        int tokens,cans;

        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.fillUp();

    }

    public static int fillUp(){
        int cans=0;
        String cansAsString;

        cansAsString = JOptionPane.showInputDialog("Please enter the number of cans you are entering into the machine");

        for(int i=0; i<cansAsString.length();i++){
            
        }

        return cans;
    }

}
