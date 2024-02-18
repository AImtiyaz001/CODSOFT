package com.Number_Game;

import java.util.*;
public class Number_Game {

	public static void main(String[] args) {
		Random random=new Random();
		Scanner sc=new Scanner(System.in);
		int roundsWon=0;
		while(true) {
		int randomNumber=random.nextInt(1,100);
		int userInput=0;
		int Guesses=1;
		
		int tries=10;

		System.out.print("Enter a number less than 100: ");
		userInput=sc.nextInt();

			while(userInput!=randomNumber ) {
				Guesses++;
				tries--;
				if(Guesses>=10) {
					break;
				}
				if(userInput!=randomNumber) {
					System.out.println("You guessed it wrong...");
					System.out.println();
					System.out.println("remaining guesses: "+tries);
					System.out.println();
					if(userInput>randomNumber) {
						System.out.print("Guess a smaller number: ");
					}else {
						 System.out.print("guess a bigger number: ");
					}
					System.out.println();
					
					userInput=sc.nextInt();
				}
			}
			if(userInput==randomNumber) {
				System.out.println();
				roundsWon++;
				System.out.println("You guessed it right in "+Guesses+" guesses");

				System.out.println("You won "+roundsWon+" rounds");
				
			}else {
				System.out.println("You failed to guess in 10 guesses");
				
				System.out.println("You won "+roundsWon+" rounds");
				roundsWon=0;
			}
				
				System.out.println("press 1 to play again ");
				System.out.println("press 2 to quit the game ");
				int playAgain=sc.nextInt();
				if(playAgain==1) {
					continue;
				}else if(playAgain==2) {
					System.out.println("You won "+roundsWon+" rounds");
					System.out.println("Thank you for playing");
					break;
				}
		}
			sc.close();
	}

}
