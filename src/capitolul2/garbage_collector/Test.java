package capitolul2.garbage_collector;

class Test {
    private int x;
    public Test(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Se elibereaza memoria ocupata de obiectul "
                + "care are x cu valoarea "+this.x);
    }
}