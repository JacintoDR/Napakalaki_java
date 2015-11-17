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
public class Mago {
    String nombre;
    Poder poder;
    Monster monstruoAmigo;
    static int totalMagos;
    
    Mago(String nombre, Poder poder, Monster monstruoAmigo){
        this.nombre = nombre;
        this.poder = poder;
        this.monstruoAmigo = monstruoAmigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Poder getPoder() {
        return poder;
    }

    public void setPoder(Poder poder) {
        this.poder = poder;
    }

    public Monster getMonstruoAmigo() {
        return monstruoAmigo;
    }

    public void setMonstruoAmigo(Monster monstruoAmigo) {
        this.monstruoAmigo = monstruoAmigo;
    }

    public static int getTotalMagos() {
        return totalMagos;
    }

    public static void setTotalMagos(int totalMagos) {
        Mago.totalMagos = totalMagos;
    }
    
    public String toString(){
        return "Nombre = " + nombre + " Poder = " + poder.toString() + " Total magos = " +
                Integer.toString(totalMagos) + "\nMonstruo Amigo = " + monstruoAmigo.toString();
    }    

}
