package bitwise_exercise;

public class Main {

	public static void main(String[] args) {
/*	Exercise 1
		int a = 23446;
		int b = 0b1;
	
		if((a & b) == 1) {
			System.out.println("Number is odd");
		} else {
			System.out.println("Number is even");
		}
*/

		// Exercise 2
		/*
		
		int a = 16;
		int b  = 7;
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
	
		System.out.println("Variable A ist: " + a);
		System.out.println("Variable B ist: " + b);
*/		

/* 
 //Exercise 3
	int a = 512;
	int b = 0;
	// int manual_mask = 0b10101010101010101010101010101010;
	
	
	for(int mask = 0b10; mask <= a; mask = mask << 2) {
		if(mask > a) {break; }
		
		b = b + (a & mask);
		System.out.println(mask);
		
		
	}
	System.out.println(b);
//	System.out.println(a & manual_mask);
		
*/	
		
/*		Exercise 4
int a = 0b101010110111;
int counter = 0;

for(int mask = 1; mask <= a; a = a >>> 1) {
	
	if((a & mask) == 1) {
		counter++;
		// System.out.println(counter);
	} 
	
}
System.out.println(counter);
*/		

/* exercise 5 
	int a = 500;
	int mask = 1;
	int position = 5;
	int clearedNumber = 0;
	
	clearedNumber = a & ~(mask << (position-1));
		System.out.println(clearedNumber);
*/ 	
/*	Exercise 6
	int a = 12;
	int bitmask = 1;
	int position = 2;
	
	int newCorrectedNum = a | (bitmask << (position-1));
	System.out.println(newCorrectedNum);
*/	
	
/* Exercise 7 
	int a = 13;
	int bitmask = 1;
	int position = 4;
	
	int newFlipNum = a ^ (bitmask << (position -1));
	System.out.println(newFlipNum);
*/ 
		
// Exercise 8
/*		
	int number = 12;
	int mask = 1;
	int position = 3;
	
	int positionValue = number & (mask << (position -1));
	
	System.out.println(positionValue);
	
*/ 
		
// Exercise 9 - ARGB Pixel
/*		
	int alpha = 128; //0 = 1000 0000
	int red = 12;	//8 = 0000 1100
	int green = 32; // 16= 0000 0100
	int blue = 64; // 24 = 0100 0000
	
	
	int argb = (alpha << 24) | (red << 16) | (green << 8) | (blue);
	System.out.println(argb);
	
	int blue2 = argb & 0b11111111;
	System.out.println(blue2);
	int green2 = (argb >> 8)& 0b11111111;
	System.out.println(green2);
	int red2 = (argb >> 16) & 0b11111111;
	System.out.println(red2);
	int alpha2 = (argb >> 24) & 0b11111111;
	System.out.println(alpha2);
	
*/ 
		
		// Exercise 10 - Helper
		
	int number = 12;
	String binaryNum = "";
	
	for(int i = 1; i <= number; i = i << 1) {
		
		if((number & i) != 0) {
			binaryNum = "1" + binaryNum;
		} else {
			binaryNum = "0" + binaryNum;
		}
		
	}
	
	System.out.println(binaryNum);
		
		
	}

}

