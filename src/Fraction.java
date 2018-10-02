public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(){
        this(0,1);
    }
    public Fraction(int numerator, int denominator){
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public Fraction multiply(Fraction fraction2){
        int newNumerator, newDenominator;
        newNumerator = this.getNumerator()*fraction2.getNumerator();
        newDenominator = this.getDenominator()*fraction2.getDenominator();

        return new Fraction(newNumerator,newDenominator);
    }
    public Fraction subtract(Fraction fraction){
        int newNumerator, newDenominator;

        newNumerator = (this.getNumerator()*fraction.getDenominator())-(fraction.getNumerator()*this.getDenominator());
        newDenominator = this.getDenominator()*fraction.getDenominator();

            return new Fraction(newNumerator,newDenominator);
    }
    public Fraction add(Fraction fraction){
        //(ad+cb)/bd
        int newNumerator, newDenominator;

        newNumerator = (this.getNumerator()*fraction.getDenominator())+(fraction.getNumerator()*this.getDenominator());
        newDenominator = this.getDenominator()*fraction.getDenominator();

        return new Fraction(newNumerator,newDenominator);
    }
    public Fraction divide(Fraction fraction){
        int newNumerator, newDenominator;

        newNumerator = this.getNumerator()*fraction.getDenominator();
        newDenominator = this.getDenominator()*fraction.getNumerator();

        return new Fraction(newNumerator,newDenominator);
    }

    public static Fraction add(Fraction fractionOne, Fraction fractionTwo){
        int newNumerator, newDenominator;

        newNumerator = (fractionOne.getNumerator()*fractionTwo.getDenominator())+(fractionTwo.getNumerator()*fractionOne.getDenominator());
        newDenominator = fractionOne.getDenominator()*fractionTwo.getDenominator();

        return new Fraction(newNumerator,newDenominator);
    }

    public static Fraction addThree(Fraction fractionOne, Fraction fractionTwo, Fraction fractionThree){
        return Fraction.add(Fraction.add(fractionOne,fractionTwo),fractionThree);
    }

    @Override
    public String toString() {
        return numerator+"/"+denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}
