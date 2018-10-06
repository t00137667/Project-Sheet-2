import javax.swing.*;

public class VendingMachineDriver {

    public static void main(String[] args) {
        int tokens,cans;

        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.fillUp(fillUp());

        System.out.print(vendingMachine.toString());

        vendingMachine.tokenInserted(1);
        System.out.println("Token inserted");
        System.out.println(vendingMachine.toString());

        vendingMachine.fillUp(13);

        vendingMachine.tokenInserted(insertToken());

        System.out.println(vendingMachine.toString());

    }

    public static int fillUp(){
        int cans=0;
        String cansAsString;
        boolean valid = false;

        while (!valid) {
            int count=0;
            cansAsString = JOptionPane.showInputDialog("Please enter the number of cans you are entering into the machine");

            for(int i=0; i<cansAsString.length();i++){
                if(Character.isDigit(cansAsString.charAt(i))){
                    count++;
                }
            }
            if(count==cansAsString.length()){
                cans = Integer.parseInt(cansAsString);
                valid = true;
            }
            else{
                JOptionPane.showMessageDialog(null,"Error, try again.");
            }
        }
        return cans;
    }
    private static int insertToken(){
        int tokens = Integer.parseInt(JOptionPane.showInputDialog("How many tokens do you want to enter?"));

        return tokens;
    }

}
