package kwic;

import java.io.*;
import static java.lang.System.out;
/**
 * This class demonstrates a functional architecture of the 
 * Keyword in Context.
 * 
 * @author Stan Sakl
 * @author Jennifer Booth
 */
public class Main 
{
    /**
     * @param args A single string containing the input file name.
     */
    public static void main(String[] args) 
    {
        out.println("Starting Keyword in Context processing.");
        
        if (args.length != 1)
        {
            out.println("You must provide a single argument containing the file name. Program will now exit.");
            System.exit(-1);
        }
        
        openInputFile(args[0]);
    }
    
    private static boolean openInputFile(String filename)
    {
        File f = new File(filename);
        out.println("Attempting to open " + f.getName());
        boolean isFileOpen = false;
        
        return isFileOpen;
    }
    
}
