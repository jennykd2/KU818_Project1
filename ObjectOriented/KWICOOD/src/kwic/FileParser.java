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
public class FileParser implements IFileParser
{
    private String filename;
    
    private Shifter shifter = new Shifter();
    
    
    
    private FileParser() 
    {
        //Do nothing
    }
    
    public FileParser(String filename) 
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
                Logger.getLogger(FileParser.class.getName()).log(Level.SEVERE, null, ex);
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

}
