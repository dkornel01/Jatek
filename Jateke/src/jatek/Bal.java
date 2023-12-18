/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jatek;

/**
 *
 * @author dobrocsi.kornel
 */
public class Bal extends Helyszin{

    @Override
    public String leiras() {
        return "balra mentel";
    }

    @Override
    public String egyikBtnFelirata() {
        return  "Dél";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Kezdes();
    }

    @Override
    public String MasikBtnFelirata() {
        return "Észak";
    }
    
}
