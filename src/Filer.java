/**
 * Created by bulochka on 24.11.2016.
 */
import java.io.*;
import java.util.*;

public class Filer {

    public void addString(String fileName, String string) throws Exception {
        File file = new File(fileName);
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write(string);
        }
    }

    public void sortBySurname(String fileName) throws Exception{
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        List<String> list = new ArrayList<>();
        
        String str;
        while((str = scanner.nextLine()) != null){
            int i = 0;
            list.add(i,str);
            i++;
        }
        
        Collections.sort(list);
        
        
        String[] string;
        String tmpString;
        for(int i = 0; i < list.size(); i++){
            tmpString = list.get(i);
            string = tmpString.split(",");
            
        }
    }
}
