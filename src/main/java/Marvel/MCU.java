package Marvel;

import com.google.gson.Gson;
import java.util.ArrayList;

public class MCU {
    private String Character;
    private String Actor;
    private ArrayList Movies;

    public String toString(){
        return(new Gson()).toJson(this);
    }

    public MCU(String character, String actor, ArrayList movies) {
        Character = character;
        Actor = actor;
        Movies = movies;
    }

    public String getCharacter() {
        return Character;
    }

    public void setCharacter(String character) {
        Character = character;
    }

    public String getActor() {
        return Actor;
    }

    public void setActor(String actor) {
        Actor = actor;
    }

    public ArrayList getMovies() {
        return Movies;
    }

    public void setMovies(ArrayList movies) {
        Movies = movies;
    }
}
