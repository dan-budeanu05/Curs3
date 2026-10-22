package capitolul2.garbage_collector;

public class MainApp {
    public static void main(String[] args) {
        Test t1 = new Test(1);
        t1 = null;
        Test t2 = new Test(2);
        Test t3 = new Test(3);
        t2 = t3;
        System.out.println("t2.getX() -> "+t2.getX());
        System.gc();
    }
}