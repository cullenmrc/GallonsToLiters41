import java.util.Scanner;

public class Converter 
{
    public static void main(String[] args) 
    {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("How many gallons do you wish to convert?");	   
	    double gallons = scan.nextDouble();
	    double liters = gallons * 3.78541178;
	    System.out.println(gallons + " gallons is equivalent to " + liters + " liters");
    }
}

