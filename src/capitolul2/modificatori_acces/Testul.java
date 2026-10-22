package capitolul2.modificatori_acces;

public class Testul {
    String camp;
}
class MainApp2 {
    public static void main(String []args) {
        Testul t=new Testul();
        t.camp="Acces permis";
    }
}