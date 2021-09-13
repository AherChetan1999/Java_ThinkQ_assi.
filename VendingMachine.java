package Welcome;
import java.util.*;
public class VendingMachine 
{

	public static void main(String[] args) 
	{
	   int amount, originalamount, quarters,dimes,nickels,pennies;
	   
	   System.out.println("Enter the whole number from 0 to 99.");
	   System.out.println("I will find a combination of coins");
	   System.out.println("that equals that amount of change.");

	   Scanner obj= new Scanner(System.in);
	   amount=obj.nextInt();
	   
	   originalamount=amount;
	   quarters=amount/25;
	   amount=amount%25;
	   dimes=amount/10;
	   amount=amount%10;
	   nickels=amount/5;
	   amount=amount%5;
	   pennies=amount;
	   
	   
	   System.out.println(originalamount + " cents in coins can be given as:");
	   System.out.println(quarters + " quarters");
	   System.out.println(dimes + " dimes");
	   System.out.println(nickels + " nikels and");
	   System.out.println(pennies + " pennies");
	   

	   
	}

}
