import java.util.Scanner;

public class Festival {
    public static void main(String[] args) {

        String green = "grünes";
        String yellow = "gelbes";
        String red = "rotes";
        String gold = "goldenes";
        String band = "Du bekommst ein %s Armbändchen. ";
        String alclight = "Bitte höchstens leichte alkoholische Getränke konsumieren.";
        String adult = "Du darfst nur mit einer Begleitperson eintreten.";
        boolean vip = false;

        Scanner s = new Scanner(System.in);
        System.out.println("Wie alt bist du: ");
        int age = s.nextInt();




        if(age >= 18){
            System.out.printf(band, green);
        }
//        else if(vip && age >= 18){
//            System.out.printf("Du bekommst ein %s und ein %s Armbändchen. " +
//                    "Du darfst in den Backstage-Bereich.", green, gold);
//        }
        else if(age >= 16 && age < 18){
            System.out.printf(band + alclight, yellow);
        }
//        else if(vip && age >= 16 && age < 18){
//            System.out.printf("Du bekommst ein %s und ein %s Armbändchen. " +
//                    "Du darfst in den Backstage-Bereich. " +
//                    "Bitte nur leichte alkoholische Getränke konsumieren.", yellow, gold);
//        }
        else if(age >= 4 && age <= 15){

            System.out.println("Hast du eine volljährige Begleitperson mit? " +
                    "Bitte gib als Antwort true oder false ein5?");
            boolean begleitung = s.nextBoolean();

            if(begleitung){
                System.out.printf(band + adult, red);
            }
            else{
                System.out.println("Sie dürfen das Festivalgelände nicht betreten.");

            }
        }
//        else if(vip && age >= 4 && age <= 15){
//            System.out.printf("Du bekommst ein %s und ein %s Armbändchen. " +
//                    "Du darfst mit einer Begleitperson in den Backstage-Bereich.", red, gold);
//        }

        else{
            System.out.println("Sie dürfen das Festivalgelände nicht betreten.");
        }
        if(vip && age > 4){
            System.out.println("Du erhältst zusätzlich einen VIP Zugang.");
        }


    }
}
