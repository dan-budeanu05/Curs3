package capitolul2.constructori.legarea_dinamica;

class SuperClasa {
    protected int a;
    private int x;
    public SuperClasa() {
        a = 2;
        x = calcul();
    }
    public int calcul() {
        return 2 * a;
    }
    @Override
    public String toString() {
        return a+", "+x;
    }
}
