import java.util.Scanner;

public class Zahlentraeume {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Bitte gib eine Zahl zwischen 1 und 10 ein: ");
        int zahl = s.nextInt();

//        if(zahl >= 1 && zahl <= 5){
//            System.out.println("Die Zahl liegt zwischen 1 und 5.");
//        }
//        else if(zahl >= 6 && zahl < 10){
//            System.out.println("Die Zahl liegt zwischen 6 und 10.");
//        }
//        else if(zahl == 10){
//            System.out.println("Jackpot!");
//        }
//        else if(zahl == 0){
//            System.out.println("Die Zahl darf nicht 0 sein.");
//        }
//        else{
//            System.out.println("Die Zahl ist zu groß oder zu klein.");
//        }

        switch(zahl){
            case 0:
                System.out.println("Die Zahl darf nicht 0 sein.");
                break;
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Die Zahl liegt zwischen 1 und 5.");
                break;
            case 6: case 7: case 8: case9:
                System.out.println("Die Zahl liegt zwischen 6 und 10.");
                break;
            case 10:
                System.out.println("Jackpot!");
                break;
            default:
                System.out.println("Die Zahl ist zu groß oder zu klein.");
        }
    }
}
