package com.cognixia.jump.corejava;

public class Loops {

	public static void main(String[] args) {
		
	// While Loop
		System.out.println("While Loop");
		
		int count = 0;
		boolean condition = true;
		while (true) {
		
			if(count % 2 != 0) {
				System.out.println(count);
				}
				count++;
				if(count % 25 ==0) {
					//condition = false;
					break;
					//return; //or use break;
				}
		}		
		
		//Do - While at least one interation
		System.out.println("\nDo while Example");
		
		int count1 = 0;
		
		do {
			System.out.println("in the loop");
			count++;
		} while (count1 < 10);
		
		//For Loop
		System.out.println("\nFor Loops:");
		for(int i = 50;i < -5; i++) {
			int x = 1;
			x+=1;
			//same thing x = x + 1 (short hand)
			System.out.println(i);
		}
		//Nested Loop
		System.out.println("\nNested Loop");
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.println(i + " " + j);
			}
		}	
	}

}
