package recursionDemonstration;

public class HarmonicEquation {

	 //Runs when option two is selected in the window.
    public static double harmonic(int n){ 

        if(n <= 1) 

            return 1; 

        else 

            return ((double) 1/n) + harmonic(n - 1); 

    } 
}
