/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author a
 */
public class BadConsequence {
    private String text;
    private int levels;
    private int nVisibleTreasures;
    private int nHiddenTreasures;
    private boolean death;
    
    private ArrayList<TreasureKind> specificHiddenTreasures = new ArrayList<TreasureKind>();
    private ArrayList<TreasureKind> specificVisibleTreasures = new ArrayList();
    
    public BadConsequence(String text, int levels, int nVisible, int nHidden){
        this.text = text;
        this.levels = levels;
        this.nVisibleTreasures = nVisible;
        this.nHiddenTreasures = nHidden;
    }
    
    public BadConsequence(String text, boolean death){
        this.text = text;
        this.death = death;
    }
    
    public BadConsequence(String text, int levels, 
            ArrayList<TreasureKind> tVisible, ArrayList<TreasureKind> tHidden){
        this.text = text;
        this.levels = levels;
        this.specificVisibleTreasures = tVisible;
        this.specificHiddenTreasures = tHidden;
    }
    
    public String getText(){
        return text;
    }    
    public int getLevels(){
        return levels;
    }
    public int getNVisibleTreasures(){
        return nVisibleTreasures;
    }
    public int getNHiddenTreasures(){
        return nHiddenTreasures;
    }
    public boolean getDeath(){
        return death;
    }
    public ArrayList<TreasureKind> getSpecificVisibleTreasures(){
        return specificVisibleTreasures;
    }
    public ArrayList<TreasureKind> getSpecificHiddenTreasures(){
        return specificVisibleTreasures;
    }
    public void substractVisibleTreasures(){
        
    }
    public void substractHiddenTreasures(){
        
    }
    public isEmpty(){
        
    }
    public BadConsequence adjustToFitTreasureLists(ArrayList <Treasure> v, ArrayList<Treasure> h){
        
    }
    public boolean myBadConsequeseIsDeath(){
        
    }
    
    public String toString(){
        String cadena =  "Mal rollo = " + text + " levels = " + Integer.toString(levels) +
                " tesoros visibles = " + Integer.toString(nVisibleTreasures) +
                " tesoros no visibles = " + Integer.toString(nHiddenTreasures) +
                " death = " + Boolean.toString(death);
        for(TreasureKind el: specificHiddenTreasures){
            cadena = cadena + el.toString() + " ";
        }
        for(TreasureKind el: specificVisibleTreasures){
            cadena = cadena + el.toString() + " ";
        }

//                " death = " + Boolean.toString(death) +
//                " specificHiddenTreasures = " + specificHiddenTreasures.toString() +
//                " specificVisibleTreasures = " + specificVisibleTreasures.toString();
        return cadena;
    }        

    
    public boolean soloPierdeNiveles(){
        if(levels>1 && nVisibleTreasures==0 && nHiddenTreasures==0 && death==false)
            return true;
        else
            return false;
    }
    public boolean pierdeTesoros(){
        if(specificHiddenTreasures != null || specificVisibleTreasures != null)
            return true;
        else
            return false;
    }

}
