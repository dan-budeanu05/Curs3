package capitolul2.mostenire;

//Un poligon este o figura geometrica plana, inchisa, formata dintr-o secventa de segmente de dreapta
//conectate cap la cap, numite laturi.

class Poligon {
    protected double[] laturi;
    public Poligon(int n) {
        laturi = new double[n];
    }
    public double perimetru( ) {
        double s=0;
        for(int i=0;i<laturi.length;i++) s+=laturi[i];
        return s;
    }
}

final class Dreptunghi extends Poligon {
    public Dreptunghi(double L, double h){
        super(4);   //apeleaza constructorul din clasa de baza, fara acesta codul apeleaza o metoda care nu exista
        laturi[0] = laturi[2] = L;
        laturi[1] =laturi[3] = h;
    }
    public double aria( ){
        return laturi[0]*laturi[1];
    }
}

class MainApp {
    public static void main(String []args) {
        Dreptunghi d=new Dreptunghi(3, 2);
        System.out.println("Perimetrul dreptunghiului este "+d.perimetru());
        System.out.println("Aria dreptunghiului este "+d.aria());
    }
}