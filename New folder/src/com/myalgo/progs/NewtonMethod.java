package com.myalgo.progs;

public class NewtonMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int root = 2;
		int t = 3;
		System.out.println(Math.E);
		while (Math.abs(t - root / t) > Math.pow(Math.E, -15) * t) {
			root = ((root / t) + t) / 2;
System.out.println("inside");
		}

	}

}
