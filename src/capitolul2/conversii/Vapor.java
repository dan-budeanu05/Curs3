package capitolul2.conversii;

class Vapor{
    private String denumire;
    private int nr_membrii_echipaj;
    public Vapor(String denumire, int nr_membrii_echipaj) {
        this.denumire = denumire;
        this.nr_membrii_echipaj = nr_membrii_echipaj;
    }
    public String getDenumire() {
        return denumire;
    }
    @Override
    public String toString() {
        return denumire + ", "+ nr_membrii_echipaj;
    }
}
class VasDeCroaziera extends Vapor{
    private int nr_restaurante;
    private int nr_piscine;
    VasDeCroaziera(String denumire,int nr_membrii_echipaj,int nr_restaurante,int nr_piscine){
        super(denumire,nr_membrii_echipaj);
        this.nr_restaurante=nr_restaurante;
        this.nr_piscine=nr_piscine;
    }

    public int getNr_restaurante() {
        return nr_restaurante;
    }
    @Override
    public String toString() {
        return super.toString()+", "+ nr_restaurante+ ", " + nr_piscine;
    }
}

class MainApp {
    public static void main(String[] args) {
        Vapor a=new Vapor("Pescarus",10);
        System.out.println(a);
        VasDeCroaziera b=new VasDeCroaziera("Harmony of the Seas", 100, 10, 7);
        System.out.println(b);
        a=b;
        System.out.println(a.toString());
        b=(VasDeCroaziera)a;
        System.out.println(b.toString());


        Vapor c=new Vapor("Pescarus",10);
        if (c instanceof Vapor)
            System.out.println("c este instanta Vapor");
        else
            System.out.println("c nu este instanta Vapor");
        if (c instanceof VasDeCroaziera)
            System.out.println("c este instanta VasDeCroaziera");
        else
            System.out.println("c nu este instanta VasDeCroaziera");


        Vapor d=new VasDeCroaziera("Seadream", 95, 5, 4);
        if (d instanceof VasDeCroaziera) {
            System.out.println(d.getDenumire()
                    +" are "+((VasDeCroaziera)d).getNr_restaurante()+" restaurante");
        }
        if (d instanceof VasDeCroaziera x) {
            System.out.println(x.getDenumire()
                    +" are "+x.getNr_restaurante()+" restaurante");
        }
    }
}