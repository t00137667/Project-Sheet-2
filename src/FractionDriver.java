public class FractionDriver {
    public static void main(String[] args) {
        int numerator, denominator;

        Fraction fractionOne = new Fraction();

        System.out.println("Testing the no argument constructor: "+ fractionOne.toString());

        Fraction fractionTwo = new Fraction(15,25);

        System.out.println("Testing the 2 argument constructor: "+ fractionTwo.toString());

        fractionOne.setNumerator(10);
        fractionOne.setDenominator(20);

        System.out.println("Value of " +fractionTwo.toString()+ " + "+fractionOne.toString()+ " is " +fractionTwo.add(fractionOne));
        System.out.println("Value of " +fractionTwo.toString()+ " - "+fractionOne.toString()+ " is " +fractionTwo.subtract(fractionOne));
        System.out.println("Value of " +fractionTwo.toString()+ " * "+fractionOne.toString()+ " is " +fractionTwo.multiply(fractionOne));
        System.out.println("Value of " +fractionTwo.toString()+ " / "+fractionOne.toString()+ " is " +fractionTwo.divide(fractionOne));

        System.out.println("Test of Class Method Addition " + Fraction.add(fractionOne,fractionTwo));

        Fraction fractionThree = new Fraction(1,4);

        System.out.println("Test of Class Method Addition " + Fraction.addThree(fractionOne,fractionTwo,fractionThree));
    }
}
