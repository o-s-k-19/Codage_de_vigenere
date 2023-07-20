package puzzle.facile;

import java.util.*;

public class LaPlusGrandeHauteur {
	
	 public static void main(String args[]) {
	        Scanner in = new Scanner(System.in);
	        // game loop
	        while (true) {
	            int max = 0;
	            int idx = 0;
	            for (int i = 0; i < 8; i++) {
	                int mountainH = in.nextInt(); // represents the height of one mountain.
	                if (mountainH > max){
	                    max = mountainH;
	                    idx = i;
	                }
	            }

	            // Write an action using System.out.println()
	            // To debug: System.err.println("Debug messages...");

	            System.out.println(idx); // The index of the mountain to fire on.
	        }
	       
	    }
	
	
}
