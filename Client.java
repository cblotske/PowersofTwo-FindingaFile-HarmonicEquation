package recursionDemonstration; 

import java.io.FileNotFoundException; 

import javax.swing.*; 


/** 

 * 

 * @author carter 

 */ 

public class Client { 

    public static void main(String[] args){ 
        showInputDialogMenu(); 
    } 

    //Code that builds the window for the recursion demonstration
    public static void showInputDialogMenu() 

    {             

        String response;    

        String optionString = "1 to run Recursion Method\n2 to run the find method\n3 to run a harmonic equation";        

        response = JOptionPane.showInputDialog( null, optionString, "Recursion Demonstration", 0 );              

        switch ( response )  

        { 
        	//If 1 is entered
            case "1" : 
                System.out.println("Calling recursion");    
            { 
                try { 
                    Recursion.problem(); 
                } catch (FileNotFoundException ex) { 
                    ex.printStackTrace(); 
                } 
            } 
                break; 
            //If 2 is entered
            case "2" : 

                System.out.println("Calling find"); 

                String response1 = JOptionPane.showInputDialog(null, "What is the file location?", 0); 
                String response2 = JOptionPane.showInputDialog(null, "What file are you looking for?", 0); 

                Find.find(response1, response2); 
                
                JOptionPane.showConfirmDialog(null, "The file was found");

                break; 
            //If3 is entered
            case "3" :    
            	
                System.out.println("Calling harmonic"); 
                String selection = JOptionPane.showInputDialog(null, "How many method runs?", 0); 

                int selection1 = Integer.valueOf(selection); 
        
                double n = HarmonicEquation.harmonic(selection1); 
                
                JOptionPane.showConfirmDialog(null, n);
                
                System.out.println(n);

            default : 

                System.exit(1); 

        } 

    }     

} 