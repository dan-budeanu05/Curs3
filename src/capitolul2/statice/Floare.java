package capitolul2.statice;

class Floare {
    protected int numarPetale;
    protected String nume;
    Floare(int numarPetale,String nume){
        this.numarPetale =numarPetale;
        this.nume=nume;
    }
    public void afiseaza(){
        System.out.println(nume+" are "+numarPetale+ " petale ");
    }
    static{
        System.out.println("Zona statica");
    }
}

class MainApp2{
    static{
        Floare g=new Floare(7,"Laleaua");
        g.afiseaza();
    }
    public static void main(String args[]){}
}