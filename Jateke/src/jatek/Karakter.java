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

    public Karakter(int eltero, int ugyesseg, int szerencse, ArrayList<String> felszereles) {
        this.eltero =(rnd.nextInt(1,7))*2+12 ;
        this.ugyesseg = (rnd.nextInt(1,7))+6;
        this.szerencse = (rnd.nextInt(1,7))+6;
        this.felszereles = felszereles;
    }
    
}
