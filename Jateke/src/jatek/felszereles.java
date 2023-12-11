/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jatek;

import java.util.UUID;

public class felszereles {
    private String nev,leiras;
    private UUID id;

    public felszereles(String nev, String leiras) {
        this.nev = nev;
        this.leiras = leiras;
        this.id = UUID.randomUUID();
    }
    
}
