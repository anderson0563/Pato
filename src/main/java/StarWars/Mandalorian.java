package StarWars;

import com.google.gson.Gson;
import java.util.ArrayList;

public class Mandalorian {
    private String Character;
    private String Specie;
    private ArrayList Weapons;

    public Mandalorian(String character, String specie, ArrayList weapons) {
        Character = character;
        Specie = specie;
        Weapons = weapons;
    }

    public String toString(){
        return(new Gson()).toJson(this);
    }

    public String getCharacter() {
        return Character;
    }

    public void setCharacter(String character) {
        Character = character;
    }

    public String getSpecie() {
        return Specie;
    }

    public void setSpecie(String specie) {
        Specie = specie;
    }

    public ArrayList getWeapons() {
        return Weapons;
    }

    public void setWeapons(ArrayList weapons) {
        Weapons = weapons;
    }
}
