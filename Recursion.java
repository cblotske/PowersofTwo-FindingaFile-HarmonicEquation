package recursionDemonstration; 

import java.io.File; 

import java.io.FileNotFoundException; 

import java.util.Scanner; 

public class Recursion { 

    private static int[] m = new int[50]; 
    
    //Runs when option one is selected in the window 
    public static void problem() throws FileNotFoundException { 
         
        try (Scanner powers = new Scanner(new File("C:\\data\\file.txt"))) {
			while(powers.hasNext()) { 
            String lineRead = powers.nextLine(); 
            try (Scanner parse = new Scanner(lineRead)) {
				parse.useDelimiter("\t");
			} 
            for(int i = 0; i < m.length; i++) { 
                int n = powers.nextInt(); 
                if(powerOfTwoBitwise(i)) { 
                    i = n;
                    System.out.println(n + ": is a power of 2"); 
                } else { 
                   System.out.println(n +": is not a power of 2"); 
                } 
            }     
        }
		} 
    } 
     
    public static boolean powerOfTwoBitwise(int n) 
    { 
        return (n & n-1)==0; 
    } 

} 

 

