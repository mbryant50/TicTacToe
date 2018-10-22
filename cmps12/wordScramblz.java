/*
  This program was completed using pair programming by me
  Michael Bryant and my partner Colman Dekker.
  I acknowledge that each partner in a programming pair should "drive"
  roughly 50% of the time the pair is working together, and at most 25%
  of an individual's effort for an assignment should be spent working
  alone. Any work done by a solitary programmer must be reviewed by the
  partner. The object is to work together, learning from each other, not
  to divide the work into two pieces with each partner working on a
  different piece.
  I spent 0 HOURS working alone.
  I spent 20 HOURS working with my partner on this assignment.
  I estimate that of the time spent with my partner, I "drove" 50
  PERCENT of the time. 
*/

/**
 * Assignment #1.
 * This program generates anagrams...
 * 
 * Authors: Michael Bryant (mibryant@ucsc.edu)
 *          and Colman Dekker (cjdekker@ucsc.edu)
 */
 


/**
class Echo {
    public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new FileInputStream(args[0]));
	
		int size = in.nextInt();//first item is the number of words

	//while loop print out of words in file
		int i = 0;
		while ( i < size ) {
			System.out.println(in.next());
			i++;
		}

    }
}

   This is intended as a starter for a word scrambler (anagram generator)
   that scrambles a randomly selected word from a word file specified on the
   command line. Modifications were made to fit the newest authors' needs.

   This program simply echos the entire contents of the file to the console.
   It assumes that the first line of the input contains the number of words in the file
   (not including the count if you think of it as a word). 
   For this program, a word is any white space delimited sequence of characters.
   @author Charlie McDowell (minor mods Dean Bailey 08/23/07, Michael Bryant and
   Colman Dekker 04/13/16)
 */

import java.io.*;
import java.util.*;

class WordScrambler {
    WordScrambler() {
    }

    public static void main(String[] args) throws FileNotFoundException {
        Random rand = new Random();
        Scanner scan = new Scanner(new FileInputStream(args[0]));
        int x = scan.nextInt();
        int y = rand.nextInt(x);
		/*this loop scans through the entire list starting at 
		 *the first enrtry of the list and continuing until 
		 *a random number is reached, at which point that entry
		 *is recorded
		 */
        for (int i = 0; i < y - 2; i += 1) {
            scan.next();
        }
        String str = scan.next();
        StringBuffer strBuffer = new StringBuffer(str);
		/*This loop takes down the entry previously recorded and
		 *records the length. it then moves the individual 
		 *characters around within the word, thus scrambling it
		 */
        for (int j = strBuffer.length() - 1; j > 0; j -= 1) {
            int j1 = rand.nextInt(j + 1);
            char c = strBuffer.charAt(j);
            strBuffer.setCharAt(j, strBuffer.charAt(j1));
            strBuffer.setCharAt(j1, c);
        }
        System.out.println(strBuffer);
    }
}
/*We attempted to use a while loop, but there seemed to be a 
 *problem regarding the available memory of the computer. The
 *code is as follows. Some feedback regarding this problem
 *would be helpful for the next assignment.
 ---------------------------------------------------------------
 FIRST LOOP-
	int i = 0;
	while (i < y - 2); {
		scan.next();
		i += 1;
	}	
	
SECOND LOOP-
	int j = strBuffer.length() - 1;
	while (j > 0); {
		int j1 = rand.nextInt(j + 1);
        char c = strBuffer.charAt(j);
        strBuffer.setCharAt(j, strBuffer.charAt(j1));
        strBuffer.setCharAt(j1, c);
		j -= 1;
	}
*/