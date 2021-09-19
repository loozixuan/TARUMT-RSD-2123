/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraction;

/**
 *
 * @author Loo Zi Xuan (It is an ADT)
 */
public interface FractionInterface {

    //abstract methods here: method header()
    void setNumerator(int numerator);

    void setDenominator(int denominator);

    int getNumerator();

    int getDenominator();

    FractionInterface add(FractionInterface fraction);

    FractionInterface subtract(FractionInterface fraction);

    FractionInterface multiply(FractionInterface fraction);

    FractionInterface divide(FractionInterface fraction);

    FractionInterface reduceFraction(FractionInterface fraction);
}
