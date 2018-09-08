package kwic;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author ssakl
 */
public class Shifter implements IShifter 
{
    private ArrayList<String> wordList = new ArrayList<>();
    
    public Shifter()
    {
        
    }

    @Override
    public ArrayList<String> getWordList()
    {
        return wordList;
    }

    @Override
    public void generateWordListFromLineList(ArrayList<String> lineList)
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
        }
    }
}
