package Movies;


import com.google.gson.Gson;
import java.util.ArrayList;

public class Cinema {
    private String name;
    private int releaseDate;

    private int yearInUCM;

    private ArrayList<String> Characters;

    public String toString(){
        return(new Gson()).toJson(this);
    }

    public Cinema(String name, int exibitionYear, int yearInUCM, ArrayList<String> characters) {
        this.name = name;
        this.releaseDate = exibitionYear;
        this.yearInUCM = yearInUCM;
        Characters = characters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getYearInUCM() {
        return yearInUCM;
    }

    public void setYearInUCM(int yearInUCM) {
        this.yearInUCM = yearInUCM;
    }

    public ArrayList<String> getCharacters() {
        return Characters;
    }

    public void setCharacters(ArrayList<String> characters) {
        Characters = characters;
    }
}
