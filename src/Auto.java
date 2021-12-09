public class Auto {
    public static void main(String[] args) {

        int cars = 3;
        int drivers = 4;
        int passengers = 6;

        System.out.println("Insgesamt fahren " + (drivers + passengers) + " Personen mit.");
        System.out.println("Es sind " + (cars * 5) + " Sitzplätze mit Gurt verfügbar.");
        System.out.println("Es ist noch " + (drivers % cars) + " Fahrer verfügbar.");
        System.out.println("Im durchschnitt sollten " + ((double)(drivers + passengers) / cars) + " Fahrer mitfahren.");

    }
}
