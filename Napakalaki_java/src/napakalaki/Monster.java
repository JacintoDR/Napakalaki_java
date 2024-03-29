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
public class Monster {
    private String name;
    private int combatLevel;
    
    private Prize price;
    private BadConsequence bc;
    
    Monster(String name, int level, BadConsequence bc, Prize price){
        this.name = name;
        this.combatLevel = level;
        this.bc = bc;
        this.price = price;
    }
    
    public String getName(){
        return name;
    }    
    public int getCombatLevel(){
        return combatLevel;
    }
    public BadConsequence getBadConsequence(){
        return bc;
    }
    public int getLevelGained(){
        
    }
    public int getTreasuresGained(){
        
    }
    public boolean kills(){
        
    }
    public String toString(){
        return "Nombre = " + name + " Nivel combate = " + Integer.toString(combatLevel) +
                "\nPremio = " + price.toString() + " Mal rollo = " + bc.toString();
    }    
    
    public boolean nivelCombateSuperior10(){
        if(combatLevel > 10)
            return true;
        else
            return false;
    }
    public boolean soloPierdeNiveles(){
        return bc.soloPierdeNiveles();
    }
    public boolean gananciaNivelesSuperior1(){
        return price.gananciaNivelesSuperior1();
    }
    public boolean pierdeTesoros(){
        return bc.pierdeTesoros();
    }
}
