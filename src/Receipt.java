import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {


        double wurst = 4.20;
        double kaese = 2.30;
        double brot = 2.11;
        double dvd = 12.00;
        double wallet = 100.00;

        Scanner s = new Scanner(System.in);
        System.out.println("Bitte gib die Stückzahl von Wurst ein: ");
        int anzWurst = s.nextInt();
        System.out.println("Bitte gib die Stückzahl von Käse ein: ");
        int anzKaese = s.nextInt();
        System.out.println("Bitte gib die Stückzahl von Brot ein: ");
        int anzBrot = s.nextInt();
        System.out.println("Bitte gib die Stückzahl von DVD ein: ");
        int anzDvd = s.nextInt();

        double preisWurst = anzWurst * wurst;
        double preisKäse = anzKaese * kaese;
        double preisBrot = anzWurst * brot;
        double preisDvd = anzWurst * dvd;
        double total = preisBrot + preisDvd + preisKäse + preisWurst;
        double rest = wallet - total;

        String wurstOutput = String.format("Wurst%10d  x  %.2f EUR", anzWurst, wurst);
        String wurstTotal = String.format("%34.2f EUR", preisWurst);
        String käseOutput = String.format("Käse%11d  x  %.2f EUR", anzKaese, kaese);
        String käseTotal = String.format("%34.2f EUR", preisKäse);
        String brotOutput = String.format("Brot%11d  x  %.2f EUR", anzBrot, brot);
        String brotTotal = String.format("%34.2f EUR", preisBrot);
        String dvdOutput = String.format("DVD%12d  x  %.2f EUR", anzDvd, dvd);
        String dvdTotal = String.format("                             %.2f EUR", preisDvd);
        String sum = String.format("Gesamt%28.2f EUR", total);
        String cash = String.format("Gegeben%27.2f EUR", wallet);
        String restgeld = String.format("Zurück%28.2f EUR", rest);

        System.out.print("\n");
        System.out.println(wurstOutput);
        System.out.println(wurstTotal);
        System.out.println(käseOutput);
        System.out.println(käseTotal);
        System.out.println(brotOutput);
        System.out.println(brotTotal);
        System.out.println(dvdOutput);
        System.out.println(dvdTotal);
        System.out.println("--------------------------------------");
        System.out.println(sum);
        System.out.println(cash);


        if(total > wallet){
            System.out.printf("Es sind noch %.2f EUR offen.", (total - wallet));
        }
        else{
            System.out.println(restgeld);

        }
    }
}
