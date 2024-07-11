package Utils;

import java.util.ArrayList;

public class Movies{
    private ArrayList<String> nameList;
    public Movies(){
        nameList = new ArrayList<>();
    }
    public ArrayList List(String... names){
        for(String name: names){
            nameList.add(name);
        }
        return nameList;
    }
}
