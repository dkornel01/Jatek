
package jatek;

public class Job extends Helyszin{

    @Override
    public String leiras() {
       return "Jobra mentel";
    }

    @Override
    public String egyikBtnFelirata() {
        return "Kelet";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Kezdes();
    }

    @Override
    public String MasikBtnFelirata() {
        return "Nyugat";
    }
    
}
