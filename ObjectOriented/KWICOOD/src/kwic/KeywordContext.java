package kwic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.lang.System.out;
/**
 *
 * @author Stan Sakl
 */
public class KeywordContext implements IKeywordContext
{
    private String filename;
    
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
    public String parseInputFile() throws FileNotFoundException
    {
        BufferedReader bufReader = new BufferedReader(new FileReader(this.filename));
        StringBuilder builder = new StringBuilder();
        String currentLine;       
    
        for(;;)
        {
            try
            {     
                currentLine = bufReader.readLine();
                if(currentLine == null) {break;}

                builder.append(currentLine).append(System.lineSeparator());
            }
            catch (IOException ex)
            {
                Logger.getLogger(KeywordContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return builder.toString();
    }        
}
