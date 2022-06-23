import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class FBTeamStandings {

    static int choice = 0;
    static boolean validChoice = false;
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Integer> selectedTeams = new ArrayList<Integer>();
    static Hashtable<Integer, String> teams  = new Hashtable<Integer, String>();
    static int numberOfGames = 0;

    public static void main(String[] args) {


        teams.put(1, "Basketball");
        teams.put(2, "Football");
        teams.put(3, "Hockey");
        teams.put(4, "Rugby");
        teams.put(5, "Soccer");
        teams.put(6, "Volleyball");

        askForInput();
    }

    public static void askForInput() {
        System.out.format("%s%n%s%n%n%s%n%s%n%s%n%s%n%s%n%s%n%n", "FB Team Standings:", "==================",
                "1 - Basketball", "2 - Football", "3 - Hockey", "4 - Rugby", "5 - Soccer", "6 - Volleyball");

        System.out.print("Choose a team from the list above: ");
        choice = scanner.nextInt();

        while(!validChoice) {
            if(choice < 1 || choice > 6) {
                System.out.print("Invalid team. Please try again: ");
                choice = scanner.nextInt();
            }
            else if(selectedTeams.contains(choice)) {
                System.out.print(teams.get(choice) + " team has already been processed. Please try again: ");
                choice = scanner.nextInt();
            }
            else {
                selectedTeams.add(choice);
                validChoice = true;
            }
        }

        System.out.print("\nHow many games did the " + teams.get(choice) + " team play this season: ");
        numberOfGames = scanner.nextInt();

        System.out.println("        Possible Outcomes:    1 - Loss        2 - Tie        3 - Win");
    }
}
