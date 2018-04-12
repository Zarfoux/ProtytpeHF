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
public class Film {
    
    private String titre;
    private String resume;
    private int avis;
    
    public Film (String t, String r, int a) {
        titre = t;
        resume = r;
        avis = a;
    }
    
    public String getTitre (){
        return titre;
    }
    
    public String getResume (){
        return resume;
    }
    
    public int getAvis (){
        return avis;
    }
}
