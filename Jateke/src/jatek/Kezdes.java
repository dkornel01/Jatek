/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jatek;

/**
 *
 * @author dobrocsi.kornel
 */
public class Kezdes  extends Helyszin implements MasikIrany{

    @Override
    public String leiras() {
        return "Ez a keezdes! Jobbra vagy kezdes";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Bal();
    }

    @Override
    public String egyikBtnFelirata() {
        return "Balra";
    }

    @Override
    public String MasikBtnFelirata() {
        return "Jobbra";
    }
    
}
