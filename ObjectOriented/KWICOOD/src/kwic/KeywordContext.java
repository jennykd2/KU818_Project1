package kwic;

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
}
