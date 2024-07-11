package Utils;

import java.util.ArrayList;

public class Characters{
    private ArrayList<String> nameList;
    public Characters(){
        nameList = new ArrayList<>();
    }
    public ArrayList List(String... names){
        for(String name: names){
            nameList.add(name);
        }
        return nameList;
    }
}
