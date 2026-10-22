package capitolul2.enumerari2;

enum Anotimp{
    PRIMAVARA,
    VARA,
    TOAMNA,
    IARNA;
    private int a=7;
    private Anotimp() {
        System.out.println("Contructor apelat pentru fiecare constanta");
    }
    void metoda() {
        System.out.println("Metoda in enumerare. a="+a);
    }
}
class MainApp {
    public static void main(String[] args) {
        Anotimp a=Anotimp.VARA;
        System.out.println(a);
        a.metoda();
    }
}