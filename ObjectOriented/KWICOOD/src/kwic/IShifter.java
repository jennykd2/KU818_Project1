/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwic;

import java.util.ArrayList;

/**
 *
 * @author ssakl
 */
public interface IShifter
{

    void generateWordListFromLineList(ArrayList<String> lineList);

    ArrayList<String> getWordList();
    
}
