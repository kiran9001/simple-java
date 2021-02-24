package com.application.corejava.MathPrograms;

//import MathPrograms.GCDEuclid;
//import trick.FastReader;

public class LCM {

	public static void main(String[] args) {
		//FastReader sc=new FastReader();
		System.out.println("Enter the number: ");
		int a=22; //sc.nextInt();
		int b=11;  //sc.nextInt();
		int hcf=GCDEuclid.gcd(a, b);
		int lcm=(a*b)/hcf;
		System.out.println("LCM of ("+a+", "+b+") = "+lcm);
	}
}
