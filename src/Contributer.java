import java.io.*;
import java.util.*;
import java.text.*;

public class Contributer {
    private int ID, kindOfContribution;
    private String name, second_name, father_name;
    private String date;
    private float summ;
    
    private Contribution contribution;
    
    public int get(){
        return contribution.getNumber();
    }

    public List<String> getList(String file_name) throws Exception{
        List<String> list = new ArrayList<>();
        File file = new File(file_name);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        return list;
    }

    public void addContributionByName(String fileName, List<String> list, String name) throws Exception{
        File file = new File(fileName);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

    }

    public void setContributer(String second_name, String name, String father_name, int kindOfContribution, float summ){
        this.second_name = second_name;
        this.name = name;
        this.father_name = father_name;
        this.kindOfContribution = kindOfContribution;
        this.summ = summ;

        Date oppeningDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.YYYY hh:mm:ss");
        this.date = sdf.format(oppeningDate);
    }

    public String getInfo() {
        String info = second_name + "," + name + "," + father_name + "," + kindOfContribution + "," + summ + "," + date + ";\n";
        return info;
    }
}
