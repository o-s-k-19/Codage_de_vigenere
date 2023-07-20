package puzzle.facile;

import java.util.*;
import java.io.*;
import java.math.*;

public class VoisinLeplusProche {
	
	

	/**
	 * Don't let the machines win. You are humanity's last hope...
	 **/

	    public static class Coordonnee {
	        private int ligne;
		    private int colonne;
		
		    public Coordonnee(int ligne, int colonne) {
			
			    this.ligne=ligne; // initialisation de l'attribt ligne
			    this.colonne = colonne; // initialisation de l'attribut colonne
	        }
	        public String toString() {
		        return "("+this.colonne +","+ this.ligne+")";
	        }

	        public int getLigne() {
		        return this.ligne;
	        }

	        public int getColonne() {
		        return this.colonne;
	        }
	    }

	    public static Coordonnee rightN(char [][] t, int height, int width, int h, int w){
	            int n = w + 1;
	            for(int j = n; j < width; j++){
	                if(t[h][j] == '0'){
	                    return new Coordonnee(h,j);
	                }
	            }
	            return new Coordonnee(-1,-1);
	    }

	    public static Coordonnee underN(char [][] t, int height, int width, int h, int w){
	            int n = h + 1;
	            for(int i = n; i < height; i++){
	                if(t[i][w] == '0'){
	                    return new Coordonnee(i,w);
	                }
	            }
	            return new Coordonnee(-1,-1);
	    }


	    public static void main(String args[]) {
	        Scanner in = new Scanner(System.in);
	        int width = in.nextInt(); // the number of cells on the X axis
	        int height = in.nextInt(); // the number of cells on the Y axis
	        if(width > 0 && width <= 30 && height > 0 && height <= 30){
	            char [][] t = new char[height][width];
	            List<String> l = new ArrayList<>();
	            int x1 = -1;
	            int y1 = -1;
	            int x2 = -1;
	            int y2 = -1;
	            int x3 = -1;
	            int y3 = -1;
	        if (in.hasNextLine()) {
	            in.nextLine();
	        }
	        for (int i = 0; i < height; i++) {
	            String line = in.nextLine(); // width characters, each either 0 or .
	            l.add(line);
	        }
	        for (int i = 0; i < height; i++) {
	            String line = l.get(i);
	        for(int j = 0; j < width; j++){
	                t[i][j] = line.charAt(j);
	                //System.err.println("("+j+","+i+") :"+line.charAt(j));
	            }
	        }

	        for (int i = 0; i < height; i++)
	            for( int j = 0; j < width; j++){
	                if(t[i][j] == '0'){
	                    x1 = j; y1 = i;
	                    y2 = rightN(t,height,width,i,j).getLigne();
	                    x2 = rightN(t,height,width,i,j).getColonne();
	                    y3 = underN(t,height,width,i,j).getLigne();
	                    x3 = underN(t,height,width,i,j).getColonne();

	                    System.out.println(""+x1+" "+y1+" "+x2+" "+y2+" "+x3+" "+y3);        
	                }
	            }


	        // Write an action using System.out.println()
	        // To debug: System.err.println("Debug messages...");


	        // Three coordinates: a node, its right neighbor, its bottom neighbor
	        
	    }
	    }
	}


