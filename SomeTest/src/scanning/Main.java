package scanning;

import java.text.NumberFormat;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to the future value calculator");
		System.out.println();
		
		Scanner sc =  new Scanner(System.in);
		
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			
			System.out.println("Enter monthly investement: ");
			double monthlyInvestment = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter yearly interest rate: ");
			double yearlyInterestRate = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter number of years:  ");
			int years = Integer.parseInt(sc.nextLine());
			
			double monthlyInterestRate = yearlyInterestRate / 12 / 100;
			int months = years * 12;
			int i = 1;
			
			double futureValue=0;
			while (i <= months) {
				futureValue = futureValue + monthlyInvestment;
				double monthlyInterestAmount = futureValue * monthlyInterestRate;
				futureValue = futureValue + monthlyInterestAmount;
				i = i +1;
			}
			
			System.out.println("Future value: " + NumberFormat.getCurrencyInstance().format(futureValue));
			System.out.println();
			
			System.out.println("Continue? (y/n): ");
		    choice = sc.nextLine();
		    System.out.println();
			
		}
		System.out.println("Bye!");
	}

}
