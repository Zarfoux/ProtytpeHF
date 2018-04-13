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
    private String image;
    private int avis;
    
    public Film (String t, String r,String i, int a) {
        titre = t;
        resume = r;
        image = i;
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
    
    public String getImage (){
        return image;
    }
}
