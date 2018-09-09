package kwic;

import java.io.FileNotFoundException;
import static java.lang.System.*;
import java.util.ArrayList;

/**
 *
 * @author ssakl
 */
public class Main 
{
  
   
    public Main()
    {
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Main main; 
        ArrayList<String> localLineList = new ArrayList<>();
        try
        {
            main = new Main();
            FileParser kwic = new FileParser(args[0]);
            localLineList = kwic.parseInputFile();
            out.println(localLineList);
            Shifter s = new Shifter();
            s.generateWordListsFromLineList(localLineList);
            
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            err.println("You must provide a filename!");
            System.exit(-1);
        }
        catch(FileNotFoundException fnfe)
        {
            err.println("Cannot find the input file!");
        }
    }   
}