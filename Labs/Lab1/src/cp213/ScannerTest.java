package cp213;

import java.util.Scanner;

/**
 * Class to demonstrate the use of Scanner with a keyboard and File objects.
 *
 * @author piercegoulimis
 * @version 2022-01-08
 */
public class ScannerTest {

    /**
     * Count lines in the scanned file.
     *
     * @author piercegoulimis
     * @param source Scanner to process
     * @return number of lines in scanned file
     */
    public static int countLines(final Scanner source) {
	int count = 0;

	// your code here
	while(source.hasNextLine()) {
		count++;
		source.nextLine();
	}

	return count;
    }

    /**
     * Count tokens in the scanned object.
     *
     * @author piercegoulimis
     * @param source Scanner to process
     * @return number of tokens in scanned object
     */
    public static int countTokens(final Scanner source) {
	int tokens = 0;

	// your code here
	while(source.hasNext()) {
		tokens++;
		source.next();
	}
	

	return tokens;
    }

    /**
     * Ask for and total integers from the keyboard.
     *
     * @author piercegoulimis
     * @param source Scanner to process
     * @return total of positive integers entered from keyboard
     */
    public static int readNumbers(final Scanner keyboard) {
	int total = 0;

	// your code here
	System.out.println("Enter a series of integers. Press 'q' to quit.");
    boolean valid = true;
    
    while (valid) {
    	if (keyboard.hasNextInt()) {
    		total += keyboard.nextInt();
    	} else if (keyboard.hasNext()) {
    		String var = keyboard.next();
    	if (var.equals("q")) {
    		valid = false;
    	} else {
    		System.out.println("Not an integer!");
      }
     } 
    }
    
	return total;
    }


} //end Class
