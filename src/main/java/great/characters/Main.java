package great.characters;

import Marvel.MCU;
import Movies.Cinema;
import StarWars.Mandalorian;
import Utils.Characters;
import Utils.Weapons;
import Utils.Movies;

import java.util.ArrayList;

public class Main {

    public <G> void print(G vetor[]){for(G a: vetor) System.out.println(a);}

    public static void main(String[] args) {
        Cinema TheFirstAvenger = new Cinema("The First Avenger", 1943, 2011, (new Characters().List("Captain America", "Chester Phillips", "Red Skull", "Peggy Carter", "Bucky Barnes")));
        Cinema CaptainMarvel = new Cinema("Captain Marvel", 1995, 2019, (new Characters().List("Carol Denvers", "Nick Fury", "Talos", "Korath")));
        Cinema IronMan = new Cinema("Iron Man", 2010, 2008, (new Characters().List("Tony Stark", "Rhodey", "Obadiah Stane")));

        Mandalorian DINDJARIN = new Mandalorian("DIN DJARIN", "Human", (new Weapons().List("Amban Sniper Rifle", "Razor Crest's Arsenal", "Beskar spear", "Mando's blaster")));
        Mandalorian BOKATANKRYZE = new Mandalorian("BO-KATAN KRYZE", "Human", (new Weapons().List("Blaster Plistol")));
        Mandalorian BOBAFETT = new Mandalorian("BOBA FETT", "Human", (new Weapons().List("Z-6 Jetpack", "Blaster Rifle", "Flame Thrower")));

        MCU TonyStark = new MCU("Tony Stark", "Robert Downey Jr", (new Movies().List("Iron Man", "Iron Man 2", "The Avengers")));
        MCU Thor = new MCU("Thor", "Chris Hemsworth", (new Movies().List("Thor", "Thor: The Dark World", "Thor: Ragnarok")));
        MCU SteveRogers = new MCU("Steve Rogers", "Chris Evans", (new Movies().List("Captain America: The First Avenger", "Captain America: The Winter Soldier", "Captain America: Civil War")));

        Cinema Marvel[] = {TheFirstAvenger, CaptainMarvel, IronMan};
        Mandalorian TheBookOfBobaFett[] = {DINDJARIN, BOKATANKRYZE, BOBAFETT};
        MCU MCU[] = {TonyStark, Thor, SteveRogers};

        Main moviesDatabase = new Main();
        moviesDatabase.print(Marvel);
        System.out.println();
        moviesDatabase.print(TheBookOfBobaFett);
        System.out.println();
        moviesDatabase.print(MCU);
    }
}