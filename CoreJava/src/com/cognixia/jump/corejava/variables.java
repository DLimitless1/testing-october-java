package com.cognixia.jump.corejava;

public class variables {

	public static void main(String[] args) {
				
			int a = 5;
			int b = 7;
			int c = 12;
			int d = 50;
			int variable =10;
			final double PI = 3.14159265;
			char h = 'A';
			boolean check10 = variable >= 10;
			
			//Calculations
			System.out.println(a * b);
			System.out.println(c * PI);
			System.out.println(d / PI);
			System.out.println(h + a);
			System.out.println(h * a);
			
			variable = 5;
			check10 = variable >=10;
			System.out.println (check10);
			
			variable = 15;
			check10 = variable >=10;
			System.out.println (check10);
			System.out.println(! check10);
	}

}
