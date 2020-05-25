
package com.capgemini.rakesh.corejava;

import java.util.Scanner;

public class UglyNumber {
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	int number;
	System.out.println("Enter a number");
	number=sc.nextInt();
	if( number==1 || number%2==0 || number%3==0 || number%5==0 )
		System.out.println(number+" is a ugly number");
	else
		System.out.println(number+" is not a ugly number");
	}

}
