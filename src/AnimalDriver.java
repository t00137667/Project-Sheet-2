import javax.swing.*;

public class AnimalDriver {
    //Array Experimentation

    //int sizeOfArray = 7;
    //static String continents[] = new String[sizeOfArray];
    //static String continent1 = "Asia", continent2 = "Africa";
    //static String con[] = {continent1,continent2};
    static String continents[] = new String[7];


    public static void main(String[] args) {
        Animal animal = new Animal();
        int arrayCount = 0;


        System.out.print(animal.toString());

        animal.setType(JOptionPane.showInputDialog("Please enter the type of animal."));

        String continentArrayString = JOptionPane.showInputDialog("Please enter the continent(s) the animal lives in.");

        for (int i = 0; i<continents.length; i++)
        {
            while(continentArrayString.equals("") && i==0){

                continentArrayString = JOptionPane.showInputDialog("No continent entered, please enter at least one continent.");
            }
            continents[i] = continentArrayString;
            continentArrayString = JOptionPane.showInputDialog("Please enter another continent. Leave blank to exit");
            if (continentArrayString.equals(""))
                i=continents.length;

            arrayCount++;

        }
        animal.setContinents(continents);
        //animal.setContinents(con);

        animal.setWeight(Float.parseFloat(JOptionPane.showInputDialog("Please enter the animal's weight")));
        animal.setAge(Integer.parseInt(JOptionPane.showInputDialog("Please enter the age of the animal")));

        JOptionPane.showMessageDialog(null,animal.toString(arrayCount));

    }
}
