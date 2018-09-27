public class MyPoint {
    private double xVal;
    private double yVal;

    public MyPoint(){
        xVal = 0;
        yVal = 0;
    }
    public MyPoint(double xVal, double yVal){
        setxVal(xVal);
        setyVal(yVal);
    }

    public String toString(){
        return getxVal() + " " + getyVal();
    }

    public void setxVal(double xVal){
        this.xVal = xVal;
    }
    public void setyVal(double yVal){
        this.yVal = yVal;
    }
    public double getxVal(){
        return xVal;
    }
    public double getyVal(){
        return yVal;
    }
}
