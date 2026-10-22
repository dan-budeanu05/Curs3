package capitolul2.statice;

class DespreStatic {
int x;
static int y;
DespreStatic(){
    x=0;
    y=0;
}
}

class MainApp1{
    public static void main(String args[]){
        DespreStatic t1=new DespreStatic();
        DespreStatic t2=new DespreStatic();
        t1.x=10;
        t1.y=10;
        t2.x=20;
        t2.y=20;
        System.out.println("t1.x="+t1.x+" t1.y="+t1.y);
        System.out.println("t2.x="+t2.x+" t2.y="+t2.y);
        System.out.println(); //modul de acces recomandat
        System.out.println("t1.x="+t1.x+" DespreStatic.y="+DespreStatic.y);
        System.out.println("t2.x="+t2.x+" DespreStatic.y="+DespreStatic.y);
    }
}
