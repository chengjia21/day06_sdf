package sg.edu.nus.iss;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.function.Consumer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException, IOException
    {
        
        HashMap<String, Integer> wordList = new HashMap<>();
        FileReader fr = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(fr);
        Integer wordTotal = 0;
        
        String line = "";

        StringBuilder sbFileContent = new StringBuilder();

        //read until end of file and append to fileContent
        while (null != (line = br.readLine())){
            sbFileContent.append(line);
        }
    
        br.close();
        fr.close();

        String fileContent = sbFileContent.toString().toLowerCase();
        fileContent = fileContent.replaceAll("[\\W]", " ");

                // fileContent = fileContent.replaceAll("[.,!@?:-]", "");


        // System.out.println(fileContent);

        String [] fileContentArray = fileContent.split("\\s+");
        // System.out.println(fileContentArray);

        for (String word: fileContentArray){
            Integer wordCount = wordList.get(word);

            if (wordCount == null){
                wordList.put(word, 1);
            }
            else {
                wordList.put(word, wordCount + 1);
            }
    
        }

        System.out.println(wordList);

        wordTotal = fileContentArray.length;
        System.out.println("Total Words = " + wordTotal);




        // while (null != (line = br.readLine())){
        //     wordList.add(Integer.parseInt(line));
        // }

        // System.out.println(">>>>>> num is " + numList + "\n");


        // Consumer<String> c = (String y);
    }
}
