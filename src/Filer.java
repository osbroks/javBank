/**
 * Created by bulochka on 24.11.2016.
 */
import java.io.*;
import java.util.*;

public class Filer {

    public void addString(String fileName, String string) throws Exception {
        File file = new File(fileName);
        FileWriter fw = new FileWriter(file, true);
        fw.write(string);
        fw.close();
    }

    public void getMssStr(String fileName) {

    }


}
