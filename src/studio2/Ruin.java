package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How much money do you start with?");
		double startAmount = in.nextDouble();
		
		System.out.println("What is your win chance?"); 
		double winChance = in.nextDouble();
		
		System.out.println("What is your win limit?"); 
		double WinLimit = in.nextDouble();
		
		System.out.println("How many days do you want to go gamble?"); 
		int totalSimulations = in.nextInt(); 
		
		
		double money = startAmount;
		
		for (int i = 0; i < totalSimulations; i++) {
			while (money <= WinLimit || money != 0) { 
	
		double outcome = Math.random();
		boolean winLose;
		if (winChance < outcome) {
			winLose = true;
			System.out.println("Win");
			money += 1; 
		}
		
		else { 
			winLose = false;
			System.out.println("Lose");
			money -= 1;
		}
		}
		}
		System.out.println("Your total money is: " + money);
		double expectedRuin; 
		double a = ((1-winChance)/winChance); 
		if (winChance == 0.5) {
			expectedRuin = (1-(startAmount/WinLimit));
			
		}
		else {
			expectedRuin = ((Math.pow(a , startAmount)-(Math.pow(a , WinLimit)))/ (1-Math.pow(a, WinLimit)));
		}
		
		System.out.println("Ruin Rate: " + (expectedRuin*100.0) + "%");
		
		
		
	}

}
