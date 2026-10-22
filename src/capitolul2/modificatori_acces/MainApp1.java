package capitolul2.modificatori_acces;

class Test {
    protected String camp_protected;
}
class MainApp1 {
    public static void main(String []args) {
        Test t=new Test();
        t.camp_protected="acces permis";
    }
}