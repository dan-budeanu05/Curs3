package capitolul2.enumerari1;

import java.util.Scanner;
enum Anotimp{
    PRIMAVARA,
    VARA,
    TOAMNA,
    IARNA
}
class MainApp {
    public static void main(String[] args) {
        Anotimp a = Anotimp.VARA;
        System.out.println(a);
        boolean ok = false;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.print("Introduceti anotimpul preferat:");
                String s = scanner.next();
                a = Anotimp.valueOf(s.toUpperCase());
                ok = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e);
            }
        } while (!ok);
        scanner.close();
        String cuvant=switch(a) {
            case PRIMAVARA->"ghiocei";
            case VARA->"soare";
            case TOAMNA->"culoare";
            case IARNA->"zapada";
            default->throw new IllegalStateException();
        };
        System.out.println("Anotimpul introdus este: "+a);
        System.out.println(a+"->"+cuvant+"\n");
        System.out.println("Anotimpurile anului sunt:");
        Anotimp [] anotimpuri=Anotimp.values();
        for (Anotimp b:anotimpuri) {
            System.out.println(b);
        }
        System.out.println("Anotimpul introdus este pe pozitia "+a.ordinal()+" in enumerare");
    }
}