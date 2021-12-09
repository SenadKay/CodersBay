public class Person {
    public static void main(String[] args) {

        String name = "Senad";
        String surname = "Kurtovic";
        char gender = 'm';
        int age = 31;
        String bplace = "Bosanska Gradiska";
        boolean marstat = true;
        double salary = 1050.00;

        System.out.println("Mein Name ist " + name + " " + surname + "\n" +
                            "Mein Geschlecht ist " + gender + " und ich bin " + age + " Jahre alt. \n" +
                            "Ich bin in " + bplace + "geboren und mein Status verheiratet (J/N) ist " +
                            marstat + ". Mein aktuelles Gehalt ist " + salary + " Euro.");
    }
}
