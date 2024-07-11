package Utils;

import java.util.ArrayList;

public class ClasseObject {
    private ArrayList<String> nameList;
    public ClasseObject(){
        nameList = new ArrayList<>();
    }
    public ArrayList List(String... names){
        for(String name: names){
            nameList.add(name);
        }
        return nameList;
    }
}
