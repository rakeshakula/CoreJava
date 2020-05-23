
package com.capgemini.rakesh.corejava;

import java.util.Scanner;

public class NumberToWords {

	public static void main(String[] args) {
		numberToWordsLogic();
	}

	public static void numberToWordsLogic() {
		Scanner sc = new Scanner(System.in);
		int number;
		int thousandWords;
		int hundredWords;
		int tenWords;
		String ones[] = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
				"Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
		String tens[] = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

		System.out.println("Enter a number : ");
		number = sc.nextInt();
		if(number > 9999) {
			System.err.println("You have entered an invalid number \nPlease enter a value less than 10000");
			numberToWordsLogic();
		}
		if (number == 0) {
			System.out.print("Zero");
		}
		if (number > 999 && number <= 9999) {
			thousandWords = number / 1000;
			// words=ones[thousands]+" Thousand";
			System.out.print(ones[thousandWords] + " Thousand ");
			number = number % 1000;
		}
		if (number <= 999 && number > 99) {
			hundredWords = number / 100;
			// words= words+ ones[hundreds]+ " Hundred";
			if(number % 100 == 0) {
				System.out.print(ones[hundredWords] + " Hundred");
			} else {
				System.out.print(ones[hundredWords] + " Hundred and ");
			}
			number = number % 100;

		}
		if (number <= 99 && number >= 20) {
			tenWords = number / 10;
			System.out.print(tens[tenWords] + " ");
			number = number % 10;
		}
		if (number < 20) {
			System.out.print(ones[number]);
		}
	}

}
