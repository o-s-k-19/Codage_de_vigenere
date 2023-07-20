package puzzle.moyen;

import java.util.Scanner;

public class BinarySearch2D {
	public static void main(String args[]) {
		//System.out.println("Enter data config :");
        Scanner in = new Scanner(System.in);
       // System.out.println("W");
//        int W = in.nextInt(); // width of the building.
       // System.out.println("H");
//        int H = in.nextInt(); // height of the building.
       // System.out.println("N");
//        int N = in.nextInt(); // maximum number of turns before game over.
//        int X0 = in.nextInt();
//        int Y0 = in.nextInt();
        
        int W = 4; // width of the building.
        int H = 7; // height of the building.
        int N = 5; // maximum number of turns before game over.
        int X0 = 2;
        int Y0 = 3;
        int xb = 3;
        int yb = 7;

        if( W >= 1 && W <= 10000 && H >= 1 && H <= 10000 && N >= 2 && N <= 100){

            // result
            int col = X0;
            int row = Y0;
            int left = 0;
            int right = 0;
            int top = 0;
            int bottom = 0;
            int tour = 0;
            System.out.println("Initial position : ("+row+", "+col+")");
        // game loop
        while (tour < N) {
        	System.out.println("Enter bombe direction : ");
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
            switch(bombDir){
                
            	 case "R" :
            		 //top = 0;
            		 //bottom = H-row -1;
                	 left = col;
                     right = W-1;
                     col = (left + right)/2;
                     
                break;

                case "L" :
                	 //top = 0;
           		 	 //bottom = H-1;
                	 left = 0;
                     right = col;
                     col = (left + right)/2;
                    
                break;
                
            	case "U" :
            		//left = 0;
            		//right = 
                    top = 0;
                    bottom = row;
                    row = (top + bottom)/2;
                
                break;

            	 case "D" :
                     top = row;
                     bottom = H-1;
                     row = (top + bottom)/2;
                     
                     break;
                
            	case "UR" :
            		 top = 0;
                     bottom = row;
                     row = (top + bottom)/2;
                     left = col;
                     right = W-1;
                     col = (left + right)/2;
                     
                break;

                case "UL" :
                	 top = 0;
                     bottom = row;
                     row = (top + bottom)/2;
                     left = 0;
                     right = col;
                     col = (left + right)/2;
                break;

               

                case "DR" :
                	 left = col;
                     right = W-1;
                     col = (left + right)/2;
                     top = row;
                     bottom = H-1;
                     row = (top + bottom)/2;
               
                break;

                case "DL" :
                	left = 0;
                    right = col;
                    col = (left + right)/2;
                    top = row;
                    bottom = H-1;
                    row = (top + bottom)/2;
                break;

               
                
            }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

           tour++;
            // the location of the next window Batman should jump to.
            System.out.println("left : "+left);
            System.out.println("right : "+right);
            System.out.println("top : "+top);
            System.out.println("bottom : "+bottom);
            System.out.println();
            System.out.println("("+row+" "+col+")");
            if( col == xb && row == yb){
            	break;
            }
        }
        
        if( col == xb && row == yb)
        	System.out.println("You win");
        else
        	System.out.println("You lose  expected : \nx : "+xb+ " found "+col+" \ny : "+yb+" found "+row);


        }
        
    }
}
