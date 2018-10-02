import javax.swing.*;

public class BicycleDriver {

    public static void main(String[] args) {
        String owner;
        double value;
        String make;

        owner = JOptionPane.showInputDialog("Please enter the name of the owner of the bicycle");
        value = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value of the bicycle"));
        make = JOptionPane.showInputDialog("Please enter the make of the bicycle");

        Bicycle firstBike = new Bicycle(owner,value,make);

        Bicycle secondBike = new Bicycle();

        secondBike.setOwner(JOptionPane.showInputDialog("Please enter the name of the owner of the bicycle"));
        secondBike.setValue(Double.parseDouble(JOptionPane.showInputDialog("Please enter the value of the bicycle")));
        secondBike.setMake(JOptionPane.showInputDialog("Please enter the make of the bicycle"));

        firstBike.setValue(firstBike.getValue()+10);

        JOptionPane.showMessageDialog(null,String.format("Bicycle Information:\nOwner: %5s\nValue: %.2f\nOwner: %5s\nValue: %.2f\nTotal Value: %.2f",firstBike.getOwner(),firstBike.getValue(),secondBike.getOwner(),secondBike.getValue(),firstBike.getValue()+secondBike.getValue()));
    }

}
