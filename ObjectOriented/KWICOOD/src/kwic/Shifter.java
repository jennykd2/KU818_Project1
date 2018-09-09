package kwic;

import java.util.ArrayList;
import java.util.StringTokenizer;

import static java.lang.System.*;

/**
 *
 * @author ssakl
 */
public class Shifter implements IShifter 
{

    
    private ArrayList<String> wordList = new ArrayList<>();
    private ArrayList<ArrayList<String>> masterWordList = new ArrayList<>();
    
    public Shifter()
    {
        
    }

    @Override
    public ArrayList<String> getWordList()
    {
        return wordList;
    }

    @Override
    public void generateWordListsFromLineList(ArrayList<String> lineList)
    {
        String line = "";
        StringTokenizer tokenizer;
        
        
        for(int i = 0; i < lineList.size(); i++)
        {
            line = lineList.get(i);
            tokenizer = new StringTokenizer(line, " ");
            
            while(tokenizer.hasMoreElements())
            {
                this.wordList.add(tokenizer.nextToken());
                
            }         
            this.wordList.sort(null);
            out.println(this.wordList.toString());
            this.getMasterWordList().add(this.wordList);
            this.wordList = new ArrayList<>();
        }

        for(int i = 0; i < getMasterWordList().size(); i++)
        {
            out.println(getMasterWordList().get(i).toString());
        }
    }
    
    /**
     * @return the masterWordList
     */
    public ArrayList<ArrayList<String>> getMasterWordList()
    {
        return masterWordList;
    }

    /**
     * @param masterWordList the masterWordList to set
     */
    public void setMasterWordList(ArrayList<ArrayList<String>> masterWordList)
    {
        this.masterWordList = masterWordList;
    }
}
