
package com.capgemini.rakesh.corejava;

import java.util.Scanner;


public class NumberToWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		int thousandWords;
		int hundredWords;
		int tenWords;
		int oneWords;
		String words=null;
		String ones[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven",
				       "Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eightteen","Nineteen"};
		String tens[]={"","","Twenty","Thirty","Forty","Fivty","Sixty","Seventy","Eighty","Ninty"};
		
		System.out.println("enter a four digit number");
		number=sc.nextInt();
		if(number==0)
		{
			System.out.print("Zero");
		}
		if(number>999 && number<=9999 )
		{
			thousandWords=number/1000;
		//words=ones[thousands]+" Thousand";
		System.out.print(ones[thousandWords]+" Thousand ");
		number=number%1000;
		}
		if(number<=999 && number>99)
		{
			hundredWords=number/100;
			//words= words+ ones[hundreds]+ " Hundred";
			System.out.print(ones[hundredWords]+ " Hundred ");
			number=number%100;
			
		}
		if(number<=99 && number>=20)
		{
			tenWords=number/10;
			System.out.print(tens[tenWords]+" ");
			number=number%10;
		}
		if(number<20)
		{
			System.out.print(ones[number]);
		}
		
	}
	
}
