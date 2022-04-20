import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter the principal");
        double p = input.nextDouble();
        System.out.println("please enter rate");
        double r = input.nextDouble();
        System.out.println("please enter the number of months");
        double n = input.nextDouble();
        double m = p * ((r* Math.pow((1+r), n))/ (Math.pow((1+r), n) - 1));
        int mortgage = (int) m;
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("your mortgage is $" + mortgage);
    }
    
}
