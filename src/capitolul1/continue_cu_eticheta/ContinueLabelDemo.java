package capitolul1.continue_cu_eticheta;

public class ContinueLabelDemo {
    public static void main(String[] args) {
        eticheta: for (int i = 0; i < 3; i++) {//for 1
            for (int j = 0; j < 3; j++) {//for 2
                if (i == 1) {
                    continue eticheta;
                } //end if
                System.out.print("(" + i + ", " + j + ")");
            } //end for 2
            System.out.println();
        } //end for 1
    } //end main
} //end class