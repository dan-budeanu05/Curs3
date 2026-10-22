package capitolul2.constructori;

class Chitara {
    private String culoare;
    private int nr_corzi;
    public Chitara(){
        culoare="Neagra";
        nr_corzi=6;
    }
    public Chitara(String culoare,int nr_corzi){
        this.culoare=culoare;
        this.nr_corzi=nr_corzi;
    }
}

//SAU

//class Chitara {
//    private String culoare;
//    private int nr_corzi;
//    public Chitara(String culoare,int nr_corzi){
//        this.culoare=culoare;
//        this.nr_corzi=nr_corzi;
//    }
//    public Chitara(){
//        this ("Neagra",6);
//    }
//}