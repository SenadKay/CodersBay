import java.util.Scanner;
import java.lang.Math;

public class NightOut {
      public static void main(String[] args) {

        // 1. Drink

        Scanner s = new Scanner(System.in);
        System.out.println("Wie viel Soda-Zitrone ist im Glas?");
        int glass = s.nextInt();

        if(glass == 250){
            System.out.println("Das Glas ist voll");
        }
        else if(glass >= 0 && glass < 250){
            System.out.println("Das Glas ist nicht mehr voll");
        }
        else if(glass >= 0 && glass < 20){
            System.out.println("Kellner neues Soda-Zitrone");
        }
        else{
            System.out.println("Bitte gib einen Wert zwischen 0 und 250 ein.");
        }

        System.out.println("Wie viele Soda-Zitrone hattest du?");
        int ammountDrink = s.nextInt();

        // Optionale Aufgabe 1

          int[] volume = {15, 125, 15, 250};

          for (int h = 0; h < volume.length; h++) {
              if(volume[h] == 250){
                  System.out.println("Das Glas ist voll");
              }
              else if(volume[h] > 20){
                  System.out.println("Das Glas ist nicht mehr voll");
              }
              else {
                  System.out.println("Kellner neues Soda-Zitrone");
              }
          }

          // 2. Bowling

          if(ammountDrink >= 0 && ammountDrink < 4){
            System.out.println("Jetzt wird gebowlt, bitte Kugel werfen");
            int pins = s.nextInt();

            switch(pins){
                case 0:
                    System.out.println("- Miss");
                    break;
                case 1: case 2: case 3:
                    System.out.println("Schwacher Treffer");
                    break;
                case 4: case 5: case 6:
                    System.out.println("Normaler Treffer");
                    break;
                case 7: case 8: case 9:
                    System.out.println("Guter Treffer");
                    break;
                case 10:
                    System.out.println("X-Strike!!!");
                    break;
                default:
                    System.out.println("Du kannst nur bis zu 10 Pins treffen");
            }
        }
        else{
            System.out.println("Du darfst heute leider nicht bowlen");
        }

        // Optionale Aufgabe 2

          int range = 11;
          int [] wuerfe = new int[12];

          for(int g = 0; g < wuerfe.length; g++){
              wuerfe[g] =(int)(Math.random() * range);

              if(wuerfe[g] >= 1 && wuerfe[g] <= 3){
                  System.out.println(wuerfe[g] + " - Schwacher Treffer");
              }
              else if(wuerfe[g] >= 4 && wuerfe[g] <= 6){
                  System.out.println(wuerfe[g] + " - Normaler Treffer");
              }
              else if(wuerfe[g] >= 7 && wuerfe[g] <= 9){
                  System.out.println(wuerfe[g] + " - Guter Treffer");
              }
              else if(wuerfe[g] == 10){
                  System.out.println(wuerfe[g] + " - X-Strike!!!");
              }
              else {
                  System.out.println(wuerfe[g] + "- Miss");
              }
          }

          // 3. Pullups

          System.out.println("\nPullup-Challenge!\n");

        for(int i = 1; i <= 20; i++){
            switch(i){
                case 10:
                    System.out.println(i + " Phu ich hoffe das ist bald vorbei");
                    break;
                case 15:
                    System.out.println(i + " Ich glaub ich schaff das nicht");
                    break;
                case 19:
                    System.out.println(i + " JA ICH SCHAFFE ES!!!!!");
                    break;
                case 20:
                    System.out.println("OLEOLEOLEEEEE");
                    break;
                default:
                    System.out.println(i);
            }
        }

        int j = 1;

        while(j <= 20){
            System.out.print("\n" + j);
            if(j == 10){
                System.out.print(" Phu ich hoffe das ist bald vorbei");
            }
            else if(j == 15){
                System.out.print(" Ich glaub ich schaff das nicht");
            }
            else if(j == 19){
                System.out.print(" JA ICH SCHAFFE ES!!!!!");
            }
            else if(j == 20){
                System.out.print(" OLEOLEOLEEEEE");
            }
            j++;

        }

        int k = 1;

        do{
            System.out.print("\n" + k);
            if(k == 10){
                System.out.print(" Phu ich hoffe das ist bald vorbei");
            }
            else if(k == 15){
                System.out.print(" Ich glaub ich schaff das nicht");
            }
            else if(k == 19){
                System.out.print(" JA ICH SCHAFFE ES!!!!!");
            }
            else if(k == 20){
                System.out.println(" OLEOLEOLEEEEE\n");
            }
            k++;
        }
        while(k <= 20);

        // 4. Back at home

        String beforeSleep = "Ich gehe noch duschen, Zähne putzen und ziehe mir " +
                "Schlafkleidung an.";
        String ammountCookies = "\nWie viele Kekse sind im Kühlschrank?";

        if(ammountDrink <= 1){
            System.out.println(beforeSleep);
        }
        else if(ammountDrink == 2){
            System.out.println(ammountCookies);
            int cookies = s.nextInt();

            int l = 1;

            while(l <= cookies){
                System.out.println("Keks " + l + " gegessen");
                l++;
            }
        }
        else if(ammountDrink >= 3){

            for(int m = 1; m <= 15 - ammountDrink; m++){
                System.out.println(m);
            }
            System.out.println("Jetzt muss ich schlafen");
        }
    }
}
