package kwic;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author Stan Sakl
 */
public interface IFileParser
{
    public ArrayList<String> parseInputFile() throws FileNotFoundException;
}
