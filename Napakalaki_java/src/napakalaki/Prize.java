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
public class Prize{
    private int treasures;
    private int level;
    
    Prize(int treasures, int level){
        this.treasures = treasures;
        this.level = level;
    }
    
    public int getTreasures(){
        return treasures;
    }
    public int getLevel(){
        return level;
    }
    public void setTreasures(int treasures) {
        this.treasures = treasures;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String toString(){
        return "Treasures = " + Integer.toString(treasures) + " levels = " + Integer.toString(level);
    }    
    
    public boolean gananciaNivelesSuperior1(){
        if(level > 1)
            return true;
        else
            return false;
    }

}
