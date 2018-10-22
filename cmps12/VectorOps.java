/*
  This programming was completed using pair programming by me
  Colman Dekker and my partner Michael Bryant.
  I acknowledge that each partner in a programming pair should "drive"
  roughly 50% of the time the pair is working together, and at most 25%
  of an individual's effort for an assignment should be spent working
  alone. Any work done by a solitary programmer must be reviewed by the
  partner. The object is to work together, learning from each other, not
  to divide the work into two pieces with each partner working on a
  different piece.
  I spent NO HOURS working alone.
  I spent 35 HOURS working with my partner on this assignment.
  I estimate that of the time spent with my partner, I "drove" 50
  PERCENT of the time. 

  Assignment #5
  This program computes vector operations such as adding two vectors,
  products between a scalar and a vector, and the angle between vectors.
  It continues on a loop until the user has had enough fun with vectors.
  
  Authors:  Colman Dekker (cjdekker@ucsc.edu)
			Michael Bryant (mibryant@ucsc.edu) 
          
*/
import java.io.*;
import java.util.*;
import java.lang.*;


class VectorOps{
    static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws NoSuchElementException {
		boolean repeat = true;
		while(repeat){//used to start the program over
			System.out.println("What would you like to find?");
			System.out.println("1. Sum of two vectors");
			System.out.println("2. Difference of two vectors");
			System.out.println("3. Magnitude of a vector");
			System.out.println("4. Scalar Product of a vector");
			System.out.println("5. Dot product of two vectors");
			System.out.println("6. Angle between two vectors");
			System.out.println("Enter your choice:");
			int selection = scan.nextInt();	

			
			if (selection == 1){
				int[] vector1 = new int[2];
				int[] vector2 = new int[2];
				System.out.println("Input the first vector:");	    
				vector1[0] = scan.nextInt();
				vector1[1] = scan.nextInt();
				System.out.println("Input the second vector:");
				vector2[0] = scan.nextInt();
				vector2[1] = scan.nextInt();
				int[] sum = sumVector(vector1, vector2);
				System.out.print("The sum of the two vectors is ");
				System.out.println(Arrays.toString(sum));
				// this cluster allows for the user to start from the top
				System.out.println("Give it another go? y/n");
				String reply = scan.next();
				if(reply.equals("y")){
					repeat = true;
					continue;
				} else if(reply.equals("n")){
					repeat = false;
					break;
				} else{
					System.out.println("Not so fast buddy");
					continue;
				}
				
			} else if (selection == 2){
				int[] vector1 = new int[2];
				int[] vector2 = new int[2];
				System.out.println("Input the first vector:");	    
				vector1[0] = scan.nextInt();
				vector1[1] = scan.nextInt();
				System.out.println("Input the second vector:");
				vector2[0] = scan.nextInt();
				vector2[1] = scan.nextInt();
				int[] diff = diffVector(vector1, vector2);
				System.out.print("The difference between the two ");
				System.out.println("vectors is " + Arrays.toString(diff));
				System.out.println("Give it another go? y/n");
				String reply = scan.next();
				if(reply.equals("y")){
					repeat = true;
					continue;
				} else if(reply.equals("n")){
					repeat = false;
					break;
				} else{
					System.out.println("Not so fast buddy");
					continue;
				}	
				
			} else if (selection == 3){
				int[] vector1 = new int[2];
				System.out.println("Input the first vector:");	    
				vector1[0] = scan.nextInt();
				vector1[1] = scan.nextInt();
				double mag = magVector(vector1);
				System.out.print("The magnitude of the vector ");
				System.out.println("is " + mag);
				System.out.println("Give it another go? y/n");
				String reply = scan.next();
				if(reply.equals("y")){
					repeat = true;
					continue;
				} else if(reply.equals("n")){
					repeat = false;
					break;
				} else{
					System.out.println("Not so fast buddy");
					continue;
				}
				
			} else if (selection == 4){
				int[] vector1 = new int[2];
				int scalar = 0;
				System.out.println("Input the first vector:");	    
				vector1[0] = scan.nextInt();
				vector1[1] = scan.nextInt();
				System.out.println("Input the scalar:");
				scalar = scan.nextInt();
				int[] scaly = scalarVector(vector1, scalar);
				System.out.print("The product is ");
				System.out.println(Arrays.toString(scaly));
				System.out.println("Give it another go? y/n");
				String reply = scan.next();
				if(reply.equals("y")){
					repeat = true;
					continue;
				} else if(reply.equals("n")){
					repeat = false;
					break;
				} else{
					System.out.println("Not so fast buddy");
					continue;
				}
				
			} else if (selection == 5){
				int[] vector1 = new int[2];
				int[] vector2 = new int[2];
				System.out.println("Input the first vector:");	    
				vector1[0] = scan.nextInt();
				vector1[1] = scan.nextInt();
				System.out.println("Input the second vector:");
				vector2[0] = scan.nextInt();
				vector2[1] = scan.nextInt();
				double dot = dotVector(vector1, vector2);
				System.out.println("The dot product is " + dot);
				System.out.println("Give it another go? y/n");
				String reply = scan.next();
				if(reply.equals("y")){
					repeat = true;
					continue;
				} else if(reply.equals("n")){
					repeat = false;
					break;
				} else{
					System.out.println("Not so fast buddy");
					continue;
				}
				
			} else if (selection == 6){
				int[] vector1 = new int[2];
				int[] vector2 = new int[2];
				System.out.println("Input the first vector:");	    
				vector1[0] = scan.nextInt();
				vector1[1] = scan.nextInt();
				System.out.println("Input the second vector:");
				vector2[0] = scan.nextInt();
				vector2[1] = scan.nextInt();
				double angle = angleVector(vector1, vector2);
				System.out.print("The Angle between these vectors ");
				System.out.println("is " + angle);
				System.out.println("Give it another go? y/n");
				String reply = scan.next();
				if(reply.equals("y")){
					repeat = true;
					continue;
				} else if(reply.equals("n")){
					repeat = false;
					break;
				} else{
					System.out.println("Not so fast buddy");
					continue;
				}
				
			} else{
				System.out.println("nice try hot shot");
				System.out.println("Give it another go? y/n");
				String reply = scan.next();
				if(reply.equals("y")){
					repeat = true;
					continue;
				} else if(reply.equals("n")){
					repeat = false;
					break;
				} else{
					System.out.println("Not so fast buddy");
					continue;
				}
			}//end if-else train
		}//end while
	}//end main
	
	//Methods used outside the main()
    
	public static int[] sumVector(int[] vector1, int[] vector2){
		int[] newvector = new int[2];
		newvector[0] = vector1[0] + vector2[0];
		newvector[1] = vector1[1] + vector2[1];
		return newvector;
	}
  
	public static int[] diffVector(int[] vector1, int[] vector2){
		int[] newvector = new int[2];
		newvector[0] = vector1[0] - vector2[0];
		newvector[1] = vector1[1] - vector2[1];
		return newvector;
	}
	public static double magVector(int[] vector1){
        double v10= (double)vector1[0];
        double v11= (double)vector1[1];
		return Math.sqrt(v10*v10 + v11*v11);
	}
    
	public static int[]  scalarVector(int[] vector1, int scalar){
		int[] newvector= new int[2];
		newvector[0] = scalar*vector1[0];
		newvector[1] = scalar*vector1[1];
		return newvector;
    }
    
	public static double dotVector(int[] vector1, int[] vector2){
		return (vector1[0]*vector2[0] + vector1[1]*vector2[1]);
    }
	
	public static double angleVector(int[] vector1, int[] vector2){
		double magV1= magVector(vector1);
		double magV2= magVector(vector2);
		double dotprod= dotVector(vector1,vector2);
		return Math.acos(dotprod/(magV1*magV2));
	}
}