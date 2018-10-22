import java.util.*;
import java.io.*;


/*  
	This program was found on stackoverflow.com as a 
	basic example of a "for" loop
*/
class ForTester{

	public static void main(String []args){
		int num = 0;
		int a = 1;
		for  (int i = 0; i<10; i++){
			System.out.println(a);
			num++;
			if (i % 2 == 0){
				a += num;
			}
			else{
				a -= num;
			}
			i++;
		}
	}
}
/*  
	This program modifies the loop and allows the user
	to input specific starting and ending points as well
	as an increment for addition or subtraction
*/
class InteractiveLoop{
	
	public static void main(String []args){
		System.out.println("Input a starting point:");
		Scanner scan1 = new Scanner(System.in);
		int x = scan1.nextInt();
		
		System.out.println("Input a finishing point:");
		Scanner scan2 = new Scanner(System.in);
		int y = scan2.nextInt();
		
		System.out.println("Input an increment:");
		Scanner scan3 = new Scanner(System.in);
		int z = scan3.nextInt();
		
		if (z > 0){
			for (int i = x; i <= y; i = (i+z)){
				System.out.println(x);
				x = (x+z);
			}
		} 
		else if (z < 0){
			for (int i = x; i >= y; i = (i+z))
				System.out.println(x);
				x = (x+z);
		} 
		else{
			System.out.println("nice try bub");
		}
	}
}

/* 
	This program was given in a lecture slide during
	class. It takes an array and reverses the order 
	in which the numbers were entered.
*/
class ReverseArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] simpleArray = new int[5];
		System.out.println("Enter 5 integers.");
		for(int i = 0; i < 5; i++){
			simpleArray[i] = scan.nextInt();
		}
		System.out.println("In reverse they are:");
		for(int i = 0; i < 5; i++){
			System.out.println(simpleArray[4-i]);
		}
	}
}
/*
	This modified program uses the same array gathering function,
	but instead of reversing the order it returns the sum of the 
	numbers entered and the product of all the numbers entered.
	Not particularly useful, but it was fun to make.
*/
class ArrayFunctions{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] simpleArray = new int[5];
		System.out.println("Enter 5 integers and watch the magic");
		for (int i = 0; i < 5; i++){
			simpleArray[i] = scan.nextInt();
		}
		int sum = 0;
		int product = 1;
		for (int i : simpleArray){
			sum += i;
			product *= i;
			}
		System.out.println("The sum of the numbers is " + sum);
		System.out.println("The product of all these numbers is " + product);
	}
}

/* 
	The following bit of code is from a lecture slide
	demonstrating "if-else" statements
if (x < y)
	min = x;
else 
	min = y;

	I then used this core concept to apply to arrays, as follows
*/

class ArrayMinMax{
// this block is the start and end point for the class	
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		int array[] = new int[5];
		System.out.println("Enter 5 numbers with spaces between each.");
		for (int i = 0 ; i < array.length; i++ ) {
			int next = input.nextInt();
			if (next == 1000){
				break;
			}
			array[i] = next;
		}
		int maxVal = getMaxValue(array);
		int minVal = getMinValue(array);
		System.out.println("The maximum is " + (maxVal));
		System.out.println("The minimum is " + (minVal));
	}
// this block finds the maximum of the array	
	public static int getMaxValue(int[] array){
		int maxValue = array[0];
		for(int i = 1; i < array.length; i++){
			if(array[i] > maxValue){
				maxValue = array[i];
			}
		}
		return maxValue;  
	}
// this block finds the minimum
	public static int getMinValue(int[] array){
		int minValue = array[0];
		for(int i = 1; i < array.length; i++){
			if(array[i] < minValue){
				minValue = array[i];
			}
		}
		return minValue;  
	}
}

