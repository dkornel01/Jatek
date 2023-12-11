/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jatek;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author dobrocsi.kornel
 */
public class Karakter {
    Random rnd=new Random();
    private int eltero,ugyesseg,szerencse;
    private ArrayList<String> felszereles;

    public Karakter(int eltero, int ugyesseg, int szerencse) {
        this.eltero =dobas()+dobas()+12;
        this.ugyesseg = dobas()+6;
        this.szerencse = dobas()+6;
    }

    public int getEltero() {
        return eltero;
    }

    public int getUgyesseg() {
        return ugyesseg;
    }

    public int getSzerencse() {
        return szerencse;
    }

    public void setEltero(int eltero) {
        this.eltero = eltero;
    }

    public void setUgyesseg(int ugyesseg) {
        this.ugyesseg = ugyesseg;
    }

    public void setSzerencse(int szerencse) {
        this.szerencse = szerencse;
    }

    public ArrayList<String> getFelszereles() {
        return felszereles;
    }

    public void setFelszereles(ArrayList<String> felszereles) {
        this.felszereles = felszereles;
    }
    public int dobas(){
    return rnd.nextInt(1,7);
}
    
    
    
}
