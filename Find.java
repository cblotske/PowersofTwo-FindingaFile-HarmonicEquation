package recursionDemonstration;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Find {

	//runs when option three is selected in the window.
    public static void find(String startPath, String fileName) { 

        try { 

			Scanner filefind = new Scanner(new File(startPath+fileName));            

        } catch (FileNotFoundException ex) { 

            System.out.println("File not found"); 

        } 

    } 
}
