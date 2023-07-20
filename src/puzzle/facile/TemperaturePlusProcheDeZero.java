package puzzle.facile;

public class TemperaturePlusProcheDeZero {

	public static void main(String args[]) {
        
		//Scanner in = new Scanner(System.in);
        //int n = in.nextInt(); // the number of temperatures to analyse
		
		//int[] tab = { -42, -5, -12, -21, -5, -24 };
		int[] tab = { 42, 5, 12, 21, 5, 24 };
		//int[] tab = { 42, -5, 12, 21, 5, 24 };
		//int[] tab = { -5,-5 };
		//int[] tab = { };
		int n = tab.length;
		
        int closeToZero = Integer.MAX_VALUE;
        if (n == 0 || n > 10000){
                closeToZero = 0;
        }
        else{
            for (int i = 0; i < n; i++) {
            int t = tab[i]; // a temperature expressed as an integer ranging from -273 to 5526
            if (Math.abs(t) < Math.abs(closeToZero)){
					closeToZero = t;
				}
			else if (Math.abs(t) == Math.abs(closeToZero)) {
			if(t < 0 && closeToZero < 0 )
				closeToZero = t;
			else
				closeToZero =Math.abs(t);
			}
            }
        }
        

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(closeToZero);
    }
}
