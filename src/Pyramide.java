public class Pyramide {
    public static void main(String[] args) {

        int z = 4;
        System.out.println();

        for (int i = 0; i < z; i++) {               // im 1. Loop wird die Höhe der Pyramide festgelegt

            for (int j = 10; j > 1; j--) {       // in der 2. Loop werden die Abstände vor X ausgegeben
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("X ");
            }
            System.out.println();
        }

        System.out.println();
    }

}

