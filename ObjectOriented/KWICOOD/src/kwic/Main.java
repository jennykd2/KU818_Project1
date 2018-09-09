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
    private ArrayList<String> lineList = new ArrayList<>();
   
    public Main()
    {
    }
    
    public Main(ArrayList<String> lineList)
    {
        this.lineList.addAll(lineList);
        
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
            main.setLineList(localLineList);
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
    
     /**
     * @return the lineList
     */
    public ArrayList<String> getLineList()
    {
        return lineList;
    }

    /**
     * @param lineList the lineList to set
     */
    public void setLineList(ArrayList<String> lineList)
    {
        this.lineList = lineList;
    }   
    
}
