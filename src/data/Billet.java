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
public class Billet {
    
    private int numBillet;
    private Film film;
    private String jour;
    private String heure;
    private String ville;
    private String cinema;
    private int nbPlace;
    private boolean annuler;
    
    public Billet (int num, Film f, String j, String h, String v, String c, int nb, boolean a) {
        numBillet = num;
        film = f;
        jour = j;
        heure = h;
        ville = v;
        cinema = c;
        nbPlace = nb;
        annuler = a;
    }
    
    public void setNumBillet (int num){
        numBillet = num;
    }
    
    public int getNumBillet (){
        return numBillet;
    }
    
    public void setFilm (Film f){
        film = f;
    }
    
    public Film getFilm (){
        return film;
    }
    
    public void setJour (String j){
        jour = j;
    }
    
    public String getJour (){
        return jour;
    }
    
    public void setHeure (String h){
        heure = h;
    }
    
    public String getHeure (){
        return heure;
    }
    
    public void setVille (String v){
        ville = v;
    }
    
    public String getVille (){
        return ville;
    }
    
    public void setCinema (String c){
        cinema = c;
    }
    
    public String getCinema (){
        return cinema;
    }
    
    public void setNbPlace (int nb){
        nbPlace = nb;
    }
    
    public int getNbPlace (){
        return nbPlace;
    }
    
    public void setAnnuler (boolean b){
        annuler = b;
    }
    
    public boolean getAnnuler (){
        return annuler;
    }
}
