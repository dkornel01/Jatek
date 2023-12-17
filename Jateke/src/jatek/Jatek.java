
package jatek;


public class Jatek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Karakter k1=new Karakter();
        System.out.println(k1.toString());
        k1.felvesz(new Felszereles("arany","arany pénz"));
        k1.felvesz(new Felszereles("arany","arany pénz"));
        k1.felvesz(new Felszereles("arany","arany pénz"));
        k1.felvesz(new Felszereles("arany","arany pénz"));
        k1.felvesz(new Felszereles("arany","arany pénz"));
        k1.felvesz(new Felszereles("arany","arany pénz"));
        k1.felvesz(new Felszereles("arany","arany pénz"));
        k1.hasznal("arany", 3);
        
    }
    
}
