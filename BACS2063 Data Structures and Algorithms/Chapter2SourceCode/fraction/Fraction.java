/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraction;

/**
 *
 * @author Loo Zi Xuan
 */
public class Fraction implements FractionInterface {

    private int numerator;
    private int denominator;

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

    @Override
    public FractionInterface add(FractionInterface fraction1) {
        Fraction resultFraction = new Fraction();

        resultFraction.numerator = numerator * fraction1.getDenominator()
                + denominator * fraction1.getNumerator();
        resultFraction.denominator = denominator * fraction1.getDenominator();
        return resultFraction;
    }

    @Override
    public FractionInterface subtract(FractionInterface fraction1) {
        Fraction resultFraction = new Fraction();

        resultFraction.numerator = numerator * fraction1.getDenominator()
                - denominator * fraction1.getNumerator();
        resultFraction.denominator = denominator * fraction1.getDenominator();
        return resultFraction;
    }

    @Override
    public FractionInterface multiply(FractionInterface fraction1) {
        Fraction resultFraction = new Fraction();

        resultFraction.numerator = numerator * fraction1.getNumerator();
        resultFraction.denominator = denominator * fraction1.getDenominator();
        return resultFraction;
    }

    @Override
    public FractionInterface divide(FractionInterface fraction1) {
        Fraction resultFraction = new Fraction();

        resultFraction.numerator = numerator * fraction1.getDenominator();
        resultFraction.denominator = denominator * fraction1.getNumerator();
        return resultFraction;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    // simplest fraction form
    int findGCD(int n, int d) {
        if (d == 0) {
            return n;
        }
        return findGCD(d, n % d);

    }

    @Override
    public FractionInterface reduceFraction(FractionInterface fraction1) {
        int div;
        Fraction resultFraction = new Fraction();
        resultFraction.numerator = fraction1.getNumerator();
        resultFraction.denominator = fraction1.getDenominator();

        div = findGCD(resultFraction.numerator, resultFraction.denominator);

        resultFraction.numerator = resultFraction.numerator / div;
        resultFraction.denominator = resultFraction.denominator / div;

        return resultFraction;
    }
}
