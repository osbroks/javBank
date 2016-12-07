import java.io.*;
import java.util.*;

public class Contribution {
    private String name;
    private int ID;
    private float percent = 0, summ = 0;
    private boolean adder = false;

    
    Contribution(){
        this.ID = (int)(Math.random())*10000;
    }
    
    public int getNumber(){
        return ID;
    }

    public List<String> getList(String fileName) throws Exception{
        List<String> list = new ArrayList<>();
        File file = new File(fileName);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String str;

        while((str = bufferedReader.readLine()) != null){
            list.add(str);
        }
        bufferedReader.close();
        return list;

    }

    public void setContribution(String name, float percent, boolean adder){
        this.name = name;
        this.percent = percent;
        this.adder = adder;
    }

    public String getInfo(){
        String info = name + "," + percent + "," + adder + ";\n";
        return info;
    }
}
