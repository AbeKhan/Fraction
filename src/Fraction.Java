public class Fraction
{
    int numerator;
    int denominator;


    public Fraction()
    {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction(int n, int d)
    {
        this.numerator = n;
        this.denominator = d;
    }

    public String toString()
    {
        return numerator + "/" + denominator;
    }

}