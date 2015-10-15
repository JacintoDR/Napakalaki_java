/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

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
    public String toString(){
        return "Nombre = " + name + " Nivel combate = " + Integer.toString(combatLevel);
    }    
}
