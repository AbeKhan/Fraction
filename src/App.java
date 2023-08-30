import javax.swing.text.html.HTMLDocument.HTMLReader.FormAction;

public class App {
    public static void main(String[] args) throws Exception 
    {
      Fraction test = new Fraction(2,9);
      Fraction test2 = new Fraction(2, 5);
      System.out.println("testing toString for test: " + test);
      System.out.println("testing toString for test2: " + test2);
      System.out.println(test + " + " + test2 + " equals " + test.add(test2));
      System.out.println(test + " * " + test2 + " equals " + test.multiply(test2));
    }
}

