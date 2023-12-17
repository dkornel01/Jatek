
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
        return super.toString()+ "felszereles{" + "nev=" + nev + ", leiras=" + leiras + ", id=" + id + '}'; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
    
    
    
}
