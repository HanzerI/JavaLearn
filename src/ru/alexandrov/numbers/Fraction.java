package ru.alexandrov.numbers;

import java.util.Arrays;
import java.util.Objects;

public final class Fraction extends Number {
    final int numerator ;
    final int denominator;

    Fraction(int numerator, int denominator){

        boolean isPositive;
        if(denominator == 0 ) throw new IllegalArgumentException("Знаменатель не должен быть равен нулю");

        if (  ( numerator < 0 && denominator < 0 ) ||  ( numerator > 0 && denominator > 0 ) )
            isPositive = true;
         else
            isPositive =false;

         //Reduce
        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);
        int minval = Math.min(numerator,denominator);
        for (int i =  minval; i  >= 2; minval--)
        {
            if (numerator % minval == 0 && denominator % minval == 0)
            {
                numerator /= minval;
                denominator /= minval;
                break;
            }
        }
        this.denominator =denominator;
        if(isPositive)
            this.numerator = numerator;
        else
            this.numerator = numerator * ( -1 );
    }

    public Fraction(int numerator) {
        this(numerator,1);
    }


    public String toString() {
        return numerator+ "/"+denominator;
    }

    private void Reduce1(int numerator,int denominator,boolean isPositive)
    {


    }

    private static int NOZ(int[] RatioDenom)
    {
        Arrays.sort(RatioDenom);
        if (RatioDenom[1] % RatioDenom[0] == 0)
            return RatioDenom[1];
        int temp;
        for(int i =2;; i++)
        {
            temp = RatioDenom[1] * i;
            if (temp % RatioDenom[0] == 0)
            {
                break;
            }

        }
        return temp;
    }



    public  Fraction sum(Fraction b)
    {
        if (this.denominator == 0 || b.denominator == 0) return new Fraction(1, 0);
        if (this.denominator == b.denominator) return new Fraction(this.numerator + b.numerator, this.denominator);
        int noz = NOZ( new int[]{ this.denominator, b.denominator });
        return new Fraction(noz / this.denominator * this.numerator + noz / b.denominator * b.numerator, noz);
    }

    public  Fraction sub(Fraction b)
    {
        if (this.denominator == 0 || b.denominator == 0) return new Fraction(1, 0);
        if (this.denominator == b.denominator) return new Fraction(this.numerator - b.numerator, this.denominator);
        int noz = NOZ( new int[]{ this.denominator, b.denominator });
        return new Fraction(noz / this.denominator * this.numerator - noz / b.denominator * b.numerator, noz);
    }

    public  Fraction mul(Fraction b)
    {
        return new Fraction(this.numerator * b.numerator, this.denominator * b.denominator);
    }

    public  Fraction div(Fraction b)
    {
        return new Fraction(this.numerator * b.denominator, this.denominator * b.numerator);
    }




    public  Fraction sum(int b)
    {
        return sum(new Fraction(b,1));
    }

    public  Fraction sub(int b)
    {
        return sub(new Fraction(b,1));
    }

    public  Fraction mul(int b)
    {
        return mul(new Fraction(b,1));
    }

    public  Fraction div(int b)
    {
        return div(new Fraction(b,1));
    }

    @Override
    public int intValue() {
        return numerator/denominator;
    }

    @Override
    public long longValue() {
        return (long)intValue();
    }

    @Override
    public float floatValue() {
        return (float)numerator/ (float)denominator ;
    }

    @Override
    public double doubleValue() {
        return (double) numerator/ (double) denominator;
    }

    public static double sum(Number ... fractions){
        if(fractions == null ) return 0;
        double result = 0;
        for (int i = 0; i < fractions.length ;i++) {
            result += fractions[i].doubleValue();
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        Fraction f =(Fraction)obj;
        return (this.numerator == f.numerator && this.denominator == f.denominator);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(numerator);
        hash = 37 * hash + Objects.hashCode(denominator);
        return hash;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Fraction(this.numerator,this.denominator);
    }
}
