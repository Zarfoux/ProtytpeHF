/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author sylva
 */
public class VariableGlobale {
    
    static final private String[] listCinema = {"Gaumont - Labége", "Gaumont - Wilson", "UGC - Wilson"}; 
    
    //Film 1
    static private Film film1 = 
            new Film("Dunkerque", "Ceci est un resume", "affiche1.jpg", 4);
    
    //Film 2 
    static private Film film2 = 
            new Film("Drive", "Ceci est un resume", "affiche2.jpg", 3);
    
    //Film 3 
    static private Film film3 = 
            new Film("Avatar", "Ceci est un resume", "affiche3.jpg", 2);
    
    //Réservation 1
    static private Billet billet1 = 
            new Billet(1, film1, "04 / 05 / 2018", "20h30", "Toulouse", "Gaumont Labége", 1, true);
    
    //Réservation 2
    static private Billet billet2 = 
            new Billet(2, film2, "05 / 05 / 2018", "20h30", "Toulouse", "Gaumont Labége", 2, true);
    
    //Réservation 3
    static private Billet billet3 = 
            new Billet(3, film3, "06 / 05 / 2018", "20h30", "Toulouse", "Gaumont Labége", 1, true);
    
    public Film getFilm (int num) {
        switch (num) {
            case 1: return film1;
            case 2: return film2;
            default: return film3;
        }
    }
    
    public Billet getBillet (int num) {
        switch (num) {
            case 1: return billet1;
            case 2: return billet2;
            default: return billet3;
        }
    }
    
    public void setBillet (Billet b) {
        switch (b.getNumBillet()) {
            case 1: 
                billet1 = b;
                break;
            case 2: 
                billet2 = b;
                break;
            default: 
                billet3 = b;
                break;
        }
    }
    
    public String[] getCinema () {
        return listCinema;
    }
}
