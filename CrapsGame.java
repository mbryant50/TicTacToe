/*
  This program was completed using pair programming by me
 
  Colman Dekker and my partner Michael Bryant.
  I acknowledge that each partner in a programming pair should "drive"
  roughly 50% of the time the pair is working together, and at most 25%
  of an individual's effort for an assignment should be spent working
  alone. Any work done by a solitary programmer must be reviewed by the
  partner. The object is to work together, learning from each other, not
  to divide the work into two pieces with each partner working on a
  different piece.
  I spent NO HOURS working alone.
  I spent 30 HOURS working with my partner on this assignment.
  I estimate that of the time spent with my partner, I "drove" 50
  PERCENT of the time. 

  Assignment #3
  This is the first of two programs for the assignment. This program
  is an interactive version of the dice game craps.
  
  Authors: Michael (mibryant@ucsc.edu) 
           and Colman Dekker (cjdekker@ucsc.edu)
 */
 
	import java.io.*;
	import java.util.*;

	class CrapsFun {
		static final boolean WIN = true;
		static final boolean LOSE = false;
		static Scanner in = new Scanner(System.in);

		PlayCraps() {
		}

		public static void main(String[] arrstring) {
			System.out.println("Enter the seed.");
			int n = in.nextInt();
			Random random = new Random(n);
			System.out.println("How many chips do you want?");
			int n2 = in.nextInt();
			int n3 = PlayCraps.getBet(n2);
			while (n3 > 0 && n2 > 0) {
				boolean bl = PlayCraps.rollDiceUntilWinOrLose(random);
				if (bl) {
					System.out.println("You won, you now have " + (n2 += n3));
				} 
				else {
					System.out.println("You lost, you now have " + (n2 -= n3));
				}
				if (n2 <= 0) continue;
				n3 = PlayCraps.getBet(n2);
				}
			}	

		static boolean rollDiceUntilWinOrLose(Random random) {
			System.out.println("hit return to roll the dice");
			in.nextLine();
			int n = PlayCraps.rollDice(random);
			if (n == 7 || n == 11) {
				return true;
			}
			if (n == 2 || n == 3 || n == 12) {
				return false;
			}
			System.out.println("The point is " + n);
			System.out.println("hit return to roll the dice");
			in.nextLine();
			int n2 = PlayCraps.rollDice(random);
			while (n2 != n && n2 != 7) {
				in.nextLine();
				n2 = PlayCraps.rollDice(random);
			}
			boolean bl = n2 != 7;
			return bl;
		}

		static int rollDice(Random random) {
			int n = random.nextInt(6) + 1;
			int n2 = random.nextInt(6) + 1;
			System.out.println("roll is " + n + ", " + n2);
			return n + n2;
		}

		static int getBet(int n) {
			System.out.println("Enter bet.");
			int n2 = in.nextInt();
			while (n2 < 0 || n2 > n) {
				System.out.println("Not an ok bet.");
				System.out.println("Enter bet.");
				n2 = in.nextInt();
			}
			in.nextLine();
			return n2;
		}
	}