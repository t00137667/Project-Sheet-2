import javax.swing.*;

public class MyPointDriver {
    MyPoint myPoint = new MyPoint(0,0);


    public static void main(String[] args) {
        MyPointDriver point = new MyPointDriver();
        point.translate(Double.parseDouble(JOptionPane.showInputDialog("Please enter the x change")),Double.parseDouble(JOptionPane.showInputDialog("Please enter the Y change")));
        point.distanceFromOrigin();
    }

    public void moveHorizontally(double displacement){
        double xVal = myPoint.getxVal();
        xVal += displacement;
        myPoint.setxVal(xVal);
    }
    private void moveVertically(double displacement){
        double yVal = myPoint.getyVal();
        yVal += displacement;
        myPoint.setyVal(yVal);
    }
    private void translate(double xChange, double yChange){
        moveHorizontally(xChange);
        moveVertically(yChange);

    }
    private void distanceFromOrigin(){
        double a = myPoint.getxVal();
        double b = myPoint.getyVal();
        double c = Math.sqrt((a*a)+(b*b));
        JOptionPane.showMessageDialog(null,"Distance from the origin is: "+ c);
    }
}
