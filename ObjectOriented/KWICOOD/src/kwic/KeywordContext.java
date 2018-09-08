package kwic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Stan Sakl
 */
public class KeywordContext implements IKeywordContext
{
    private String filename;
    
    private Shifter shifter = new Shifter();
    
    
    
    private KeywordContext() 
    {
        //Do nothing
    }
    
    public KeywordContext(String filename) 
    {
        this.filename = filename;
    }
    
    /**
     *
     * @return
     * @throws FileNotFoundException
     */
    @Override
    public ArrayList<String> parseInputFile() throws FileNotFoundException
    {
        BufferedReader bufReader = new BufferedReader(new FileReader(this.getFilename()));
        ArrayList<String> lineList = new ArrayList<>();
        String currentLine;       
    
        for(;;)
        {
            try
            {     
                currentLine = bufReader.readLine();
                if(currentLine == null) {break;}
                
                lineList.add(currentLine);
            }
            catch (IOException ex)
            {
                Logger.getLogger(KeywordContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lineList;
    }     
    
    /**
     * @return the filename
     */
    public String getFilename()
    {
        return filename;
    }

    /**
     * @param filename the filename to set
     */
    public void setFilename(String filename)
    {
        this.filename = filename;
    }
    
    public Shifter getShifter()
    {
        return this.shifter;
    }
    
    public void setShifter(Shifter shifter)
    {
        this.shifter = shifter;
    }
}
