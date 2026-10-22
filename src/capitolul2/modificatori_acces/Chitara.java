package capitolul2.modificatori_acces;

class Chitara {
    private String culoare;
    private int nr_corzi;
    public Chitara(String culoare,int nr_corzi){
        this.culoare=culoare;
        this.nr_corzi=nr_corzi;
    }
    public Chitara() {
        this ("Neagra",6);
    }
    public String getCuloare () {
        return culoare;
    }
    public void setCuloare (String culoare) {
        this.culoare=culoare;
    }
//…
}