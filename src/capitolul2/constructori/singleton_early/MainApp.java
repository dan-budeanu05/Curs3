package capitolul2.constructori.singleton_early;
//early instantiation

class Singleton {
    //creaza un obiect al clasei Singleton
    private static Singleton instance = new Singleton();
    //Constuctorul este privat deci nu se poate apela din alta clasa pentru instantiere
    private Singleton(){}
    //Returneaza singurul obiect disponibil
    public static Singleton getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Ok!");
    }
}

class MainApp {
    public static void main(String[] args) {
//Instantierea de mai jos da eroare. Constructorul privat nu este este vizibil.
//Singleton object = new Singleton();
//Preia singurul obiect disponibil
        Singleton object = Singleton.getInstance();
//Afiseaza mesajul
        object.showMessage();
    }
}