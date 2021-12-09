import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

public class Kino {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        ArrayList<String[]> movies = GetAvailableMovies();

        // das ist ein kommentar
        PrintAvailableMovies(movies);

        String userSelectedMovie = GetUserInput();
        Integer selectedMovieNumber = SelectMovieTicket(userSelectedMovie, movies);

        String available = "verfügbar";

        String[] selectedMovie = movies.get(selectedMovieNumber);

        int ticket;
        if (selectedMovie[5].equals(available)) {
            System.out.println("Film buchen? Bitte mit 'Ja' bestätigen ");
            String bestätigung = inputScanner.next();
            if (bestätigung.equals("ja")) {
                System.out.println("Sie haben ein Ticket für die Filmnummer " + selectedMovie[0] + " gebucht.");
                ticket = selectedMovieNumber;
            } else {
                System.out.println("Eingabe ungültig");
                return;
            }

            System.out.println("Aktuelle Uhrzeit? Bitte im Format 'hhmm' eingeben:");
            String userTime = inputScanner.next();
            if (userTime.length() == 0) {
                System.out.println("Eingabe ungültig");
                return;
            }

            int userTimeInt = Integer.parseInt(userTime);
            int movieTimer = Integer.parseInt(selectedMovie[3].replaceFirst(":", ""));

            if(movieTimer - userTimeInt >= 10){
                System.out.println("Du hast noch genug Zeit um dir Snacks zu holen. Verügbare Snacks: ");
            }
            else{
                System.out.println("Du kannst bei Bedarf noch auf die Toilette gehen. Für Snacks leider keine Zeit!");
            }

            ArrayList<String[]> snacks = GetSnacks();
            PrintSnacks(snacks);

            double totalPrice = SelectSnacks(snacks);
            String priceOutput = String.format("Bitte bezahlen Sie: %.2f EUR", totalPrice);
            System.out.println(priceOutput);

            double userMoney = inputScanner.nextDouble();
            if(userMoney < totalPrice){
                System.out.println("Sie haben nicht genügend Geld mit");
            }
            else{
                System.out.println("Danke für ihren Besuch");
            }


        } else {
            System.out.println("Der Film ist leider ausgebucht");
        }


    }

    private static Date ConvertToDate(String userTime) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("hh:mm");
        return format.parse(userTime);
    }

    public static int SelectMovieTicket(String userMovie, ArrayList<String[]> movies) {
        Boolean movieFound = true;
        int counter = 0;

        while (movieFound) {
            if (counter >= movies.size()) {
                userMovie = GetUserInput();
                counter = 0;
            }

            String[] movieInfos = movies.get(counter);
            if (userMovie.equals(movieInfos[0])) {
                System.out.printf("Sie haben folgenden Film gewählt:\n" + "%5s | %1s | %1s | %1s | %1s \n"
                        , movieInfos[0], movieInfos[1], movieInfos[2], movieInfos[3], movieInfos[4]);
                return counter;
            }
            counter++;
        }

        return -1;
    }

    public static void PrintAvailableMovies(ArrayList<String[]> movies) {
        System.out.println();
        for (String[] strArr : movies) {
            System.out.printf("%5s | %1s | %1s | %1s | %1s | %1s\n"
                    , strArr[0], strArr[1], strArr[2], strArr[3], strArr[4], strArr[5]);
        }
        System.out.println();
    }

    public static ArrayList<String[]> GetAvailableMovies() {
        ArrayList<String[]> movies = new ArrayList<String[]>();
        movies.add(new String[]{"1", "Iron Man", "3D", "20:15", "Saal 1", "verfügbar"});
        movies.add(new String[]{"2", "Hulk", "2D", "21:15", "Saal 3", "ausgebucht"});
        movies.add(new String[]{"3", "Iron Man 2", "2D", "20:30", "Saal 2", "verfügbar"});
        movies.add(new String[]{"4", "Thor", "3D", "23:00", "Saal 1", "ausgebucht"});
        return movies;
    }

    public static String GetUserInput() {
        System.out.println("\nBitte wählen Sie einen Film: ");
        Scanner s = new Scanner(System.in);
        return s.next();
    }

    public static ArrayList<String[]> GetSnacks() {
        ArrayList<String[]> movies = new ArrayList<String[]>();
        movies.add(new String[]{"1", "M&Ms", "2.50"});
        movies.add(new String[]{"2", "Popcorn", "2.00"});
        movies.add(new String[]{"3", "Chips", "1.50€" });
        return movies;
    }

    public static void PrintSnacks(ArrayList<String[]> snacks) {
        System.out.println();
        for (String[] strArr : snacks) {
            System.out.printf("%5s | %1s | %1s€\n"
                    , strArr[0], strArr[1], strArr[2]);
        }
        System.out.println();
    }

    public static double SelectSnacks(ArrayList<String[]> snacks) {
        double totalPrice = 0;
        Scanner inputScanner = new Scanner(System.in);

        while (true) {

            System.out.println("Bitte wälen Sie die gewünschten Snacks. Mit der Taste [e] wird beendet");
            String userInput = inputScanner.next();
            if(userInput.contains("e")){
                break;
            }

            int userInputInt = Integer.parseInt(userInput);
            if(userInputInt == 0){
                System.out.println("Falsche eingabe");
                continue;
            }

            double snackPrice = GetSnackPrice(userInputInt, snacks);

            totalPrice += snackPrice;

            PrintSnacks(snacks);

            String more = inputScanner.next();
            if(more.equals("e")){
                break;
            }
        }

        return totalPrice;
    }

    public static double GetSnackPrice(int selectedSnack, ArrayList<String[]> snacks){
        for (String[] strArr : snacks) {

            int snackNumber = Integer.parseInt(strArr[0]);
            if(snackNumber == selectedSnack){
                return Double.parseDouble(strArr[2]);
            }
        }
        return -1;
    }



//    public static Map<String, Double> GetSnacks(){
//        Map<String, Double> snacks = new HashMap<String, Double>() {{
//            put("M&Ms", 2.40);
//            put("Popcorn", 2.00);
//            put("Chips", 1.50);
//        }};
//        return snacks;
//    }
}

