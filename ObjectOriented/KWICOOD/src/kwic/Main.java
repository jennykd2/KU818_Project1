/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kwic;

import java.io.FileNotFoundException;
import static java.lang.System.*;

/**
 *
 * @author ssakl
 */
public class Main 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Main main; 
        try
        {
            main = new Main();
            KeywordContext kwic = new KeywordContext(args[0]);
            out.println(kwic.parseInputFile());
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
