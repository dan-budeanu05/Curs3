package capitolul2.constructori.legarea_dinamica;

class SubClasa extends SuperClasa {
    private int y;

    public SubClasa() {
        y = calcul();
    }

    @Override
    public int calcul() {
        return 3 * a;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + y;
    }
}