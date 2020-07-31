package test;

import java.util.Scanner;

public class Jar {

     public static void main(String []args){
     	Scanner scan = new Scanner(System.in);
     	System.out.print("Enter the first jar volume: ");
     	int bigVol = scan.nextInt();
     	System.out.print("Enter the second jar volume: ");
     	int smallVol = scan.nextInt();
     	System.out.print("Enter the needed water volume: ");
     	int needed = scan.nextInt();
     	if (needed == bigVol){
     		System.out.println("Fill " + bigVol + "l: (" + bigVol + "l = " + bigVol + ", " + smallVol + "l = 0) ");
		System.out.println("Great job!!!!!");
		return;
     	}
     	if (needed == smallVol){
     		System.out.println("Fill " + smallVol + "l: (" + bigVol + "l = 0, " + smallVol + "l = " + smallVol + ") ");
		System.out.println("Great job!!!!!");
		return;
     	}
     	if (bigVol < smallVol){
     		int c = bigVol;
     		bigVol = smallVol;
     		smallVol = c;
     	}
     	int max = 0; // water in the big jar
     	int min = 0; // water in the small jar
     	int i;
	for ( i = 1; i <= 2000; ++i){
		if (needed == max){
			System.out.println("Fill " + bigVol + "l: (" + bigVol + "l = " + max + ", " + smallVol + "l = " + min + ") ");
			System.out.println("Great job!!!!!");
			break;
		}
		if (needed == min){
			System.out.println("Fill " + smallVol + "l: (" + bigVol + "l = " + max + ", " + smallVol + "l = " + min + ")");
			System.out.println("Great job!!!!!");
			break;
		}
		if (min == smallVol){
			min = 0;
			System.out.println("Empty " + smallVol + "l: (" + bigVol + "l = " + max + ", " + smallVol + "l = " + min + ")");
		}
		if (max == 0){
			max += bigVol;
			System.out.println("Fill " + bigVol + "l: (" + bigVol + "l = " + max + ", " + smallVol + "l = " + min + ")");
		}
		if (max > (smallVol - min)){
			System.out.print("Fill from " + bigVol + "l into " + smallVol + "l " + (smallVol - min) + "l : (");
			max -= (smallVol - min);
			min += (smallVol - min);
			System.out.println(bigVol + "l = " + max + ", " + smallVol + "l = " + min + ")");
		} 
		else {
			System.out.print("Fill from " + bigVol + "l into " + smallVol + "l " + max + "l : (");
			int temp = max;
			max -= temp;
			min += temp;
			System.out.println(bigVol + "l = " + max + ", " + smallVol + "l = " + min + ")");
		} 
		
	}
	if (i == 2001){
	System.out.println("The problem isn't solved after 2000 steps");
	}
     }
}