package sg.edu.nus.iss;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        List<Integer> numList = new LinkedList<>();

        FileReader fr = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(fr);
        
        String line;

        while (null != (line = br.readLine())){
            numList.add(Integer.parseInt(line));
        }

        System.out.println(">>>>>> num is " + numList + "\n");


        Consumer<String> c = (String y);
    }
}
