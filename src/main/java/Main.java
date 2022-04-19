import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        double p = 100000;
        double r = 0.005;
        double n = 180;
        double m = p * ((r* Math.pow((1+r), n))/ (Math.pow((1+r), n) - 1));
        //NumberFormat result = currency.format
        System.out.println("your morgage is " + m);
    }
    
}
