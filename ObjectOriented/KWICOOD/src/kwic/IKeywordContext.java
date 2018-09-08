package kwic;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author Stan Sakl
 */
public interface IKeywordContext
{
    public ArrayList<String> parseInputFile() throws FileNotFoundException;
}
