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
    private ArrayList<Felszereles> felszereles=new ArrayList<Felszereles>();
    Felszereles bot=new Felszereles("bot","bot");
    //Felszereles bot=new Felszereles

    public Karakter() {
        this.eltero =dobas()+dobas()+12;
        this.ugyesseg = dobas()+6;
        this.szerencse = dobas()+6;
        
    }

    @Override
    public String toString() {
        return "Karakter{" + "eltero=" + eltero + ", ugyesseg=" + ugyesseg + ", szerencse=" + szerencse + '}';
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

    public ArrayList<Felszereles> getFelszereles() {
        return felszereles;
    }

    public void setFelszereles(ArrayList<Felszereles> felszereles) {
        this.felszereles = this.felszereles;
    }
    public int dobas(){
    return rnd.nextInt(1,7);
    }
    public void hasznal(String nev){
    this.hasznal(nev, 1);
    }
    public void hasznal(String nev,int db){
        this.hasznal(nev, db, true);
    }
    public void hasznal(String nev,int db,boolean van){
       int[] tomb=new int[felszereles.size()];
       boolean ures=false;
       int i=0;
       int szamlalo=0;
       for (Felszereles felszereles : felszereles) {
           szamlalo++;
            if(nev==felszereles.getNev() && db>0  ){
                ures=true;
                tomb[i]=szamlalo;
                i++;
            }
        }
       if (ures){
           if (van==true || szamlalo>=db){
            for (int x=tomb.length;x>0;){
                x=x-1;
                if (db>0){
                db--;
                this.felszereles.remove(tomb[x-1]);
                }
            }
           }
       }
    }
    public void felvesz(Felszereles felszreles){
        this.felvesz(1,felszreles);
    }
    public void felvesz(int menny,Felszereles felszreles ){
        for (int i = 0; i < menny; i++) {
            this.felszereles.add(felszreles);
        }
    }
    public void levonas(String nev,int db){
        for (Felszereles felszereles : felszereles) {
            if(nev==felszereles.getNev() && db>0  ){
                db--;
                this.felszereles.remove(felszereles.getId());
            }
        }
    }
}
