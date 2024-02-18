package com.Word_Counter;
import java.util.*;
public class Word_Counter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your words");
		String Words=sc.nextLine();
		int counter=Words.length();
		
		if(counter<1) {
			System.out.println("Not enough words");
		}else {
			String a=Words.replaceAll("  ", " ");
			String Arr[]=a.split(" ");
			counter=Arr.length;
			System.out.println("You have entered "+counter+" words");
		}
		sc.close();
	}
}

