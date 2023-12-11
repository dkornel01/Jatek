/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jatek;

import java.util.Random;
import java.util.UUID;

public class Felszereles {
    Random rnd=new Random();
    private String nev,leiras;
    private UUID id;

    public Felszereles(String nev, String leiras) {
        this.nev = nev;
        this.leiras = leiras;
        this.id = UUID.randomUUID();
    }
    public String getNev() {
        return nev;
    }

    public String getLeiras() {
        return leiras;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "felszereles{" + "nev=" + nev + ", leiras=" + leiras + ", id=" + id + '}';
    }
    
    
    
}
