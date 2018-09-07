/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kwic;

import static java.lang.System.*;

/**
 *
 * @author ssakl
 */
public class Main 
{
    public Main(String filename)
    {
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Main main; 
        try
        {
            main = new Main(args[0]);
            out.println("Attempting to open " + args[0]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            err.println("You must provide a filename!");
            System.exit(-1);
        }
    }

}
