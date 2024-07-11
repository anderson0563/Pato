package Utils;

import java.util.ArrayList;

public class Weapons{
    private ArrayList<String> nameList;
    public Weapons(){
        nameList = new ArrayList<>();
    }
    public ArrayList List(String... names){
        for(String name: names){
            nameList.add(name);
        }
        return nameList;
    }
}
