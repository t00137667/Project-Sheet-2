public class Bicycle {
    private String owner;
    private double value;
    private String make;

    public Bicycle(){
        setOwner(null);
        setValue(0);
        setMake(null);
    }
    public Bicycle(String owner, double value, String make){
        setOwner(owner);
        setValue(value);
        setMake(make);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getOwner() {
        return owner;
    }

    public double getValue() {
        return value;
    }

    public String getMake() {
        return make;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
