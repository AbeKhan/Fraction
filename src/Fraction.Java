public class Fraction
{
    int numerator;
    int denominator;

    //Creating the constructor 
    public Fraction()
    {
        this.numerator = 0;
        this.denominator = 1;
    }

    //Overloaded constructor
    public Fraction(int n, int d)
    {
        this.numerator = n;
        this.denominator = d;
    }

    // Changing toString, 
    public String toString()
    {
        return numerator + "/" + denominator;
    }

    //adding the Euclidean algorithm to find the Greatest Common Divisor
    static int gcd(int a, int b)
    {
    if(b == 0)
    {
        return a;
    }
    return gcd(b, a % b);
    }

    // method to return Least Common Multiple of two numbers
    static int lcm(int a, int b)
    {
      return (a / gcd(a, b)) * b;
    }


    public Fraction add(Fraction other)
    {

       int lcm = lcm(denominator, other.denominator);

       int m1 = lcm / denominator;
       int m2 = lcm / other.denominator;


       Fraction holder = new Fraction(numerator*m1 + other.numerator*m2, lcm);
        holder.reduce();
       return holder;
    } 

    public Fraction multiply(Fraction other)
    {
        Fraction holder;
        int n = numerator * other.numerator;
        int d = denominator * other.denominator;

        holder = new Fraction(n,d);
        holder.reduce();
        return  holder;
    } 

    public void reduce() 

    {
        numerator /= gcd(numerator,denominator);
        denominator /= gcd(numerator,denominator);
    }
}