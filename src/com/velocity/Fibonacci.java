package com.velocity;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Fibonacci no: ");
	    int input=scanner.nextInt();
		for(int i=1 ;i<=input ;i++) {
			c=a+b;
			System.out.println(a);
			a=b;
			b=c;
		}
	}
		
	}


