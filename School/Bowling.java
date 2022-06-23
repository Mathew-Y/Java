import java.util.Scanner;

class Bowler {

    String name;
    int points;
    int[][] results;

    Bowler(String name, int points, int[][] results) {
        this.name = name;
        this.points = points;
        this.results = results;
    }
}

public class Bowling {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int temp1throw = 0;
        int numberOfPlayers = 0;
        String player1Name;
        String player2Name;
        int[][] player1Results = new int[10][2];
        int[][] player2Results = new int[10][2];

        System.out.print("Indicate how many players (1 or 2): ");
        numberOfPlayers = scan.nextInt();

        if(numberOfPlayers == 1) {
            System.out.print("Enter Player 1's name: ");
            player1Name = scan.next();

            Bowler player1 = new Bowler(player1Name, 0, player1Results);

            for(int i = 0; i < 10; i++) {
                for(int j = 0; j < 2; j++) {
                    System.out.print("Frame " + (i+1) + ": Enter " + player1.name + "'s throw #" + (j+1) + ": ");
                    temp1throw = scan.nextInt();
                    player1.results[i][j] = temp1throw;
                }
                System.out.println();
            }

            for(int i = 0; i < 10; i++) {
                if(player1.results[i][0] == 10) {
                    player1.points += 20;
                }
                else if(player1.results[i][0] + player1.results[i][1] == 10){
                    player1.points += 15;
                }
                else {
                    player1.points += (player1.results[i][0] + player1.results[i][1]);
                }

                System.out.format("%n%-20s%s%-20d%s%-20d%s%d%s%d", player1.name, "Throw 1 - ", player1.results[i][0], "Throw 2 - ", player1.results[i][1], "Total points after frame ", (i+1), " - ", player1.points);
            }
        }
        else {
            System.out.print("Bowler 1 - Enter your name: ");
            player1Name = scan.next();
            Bowler player1 = new Bowler(player1Name, 0, player1Results);

            System.out.print("Bowler 2 - Enter your name: ");
            player2Name = scan.next();
            Bowler player2 = new Bowler(player2Name, 0, player2Results);

            for(int i = 0; i < 10; i++) {
                System.out.print("Frame " + (i+1) + ": Enter " + player1.name + "'s throw #1: ");
                temp1throw = scan.nextInt();
                player1.results[i][0] = temp1throw;

                System.out.print("Frame " + (i+1) + ": Enter " + player1.name + "'s throw #2: ");
                temp1throw = scan.nextInt();
                player1.results[i][1] = temp1throw;

                System.out.println();

                System.out.print("Frame " + (i+1) + ": Enter " + player2.name + "'s throw #1: ");
                temp1throw = scan.nextInt();
                player2.results[i][0] = temp1throw;

                System.out.print("Frame " + (i+1) + ": Enter " + player2.name + "'s throw #2: ");
                temp1throw = scan.nextInt();
                player2.results[i][1] = temp1throw;

                System.out.println();
            }

            for(int i = 0; i < 10; i++) {
                if(player1.results[i][0] == 10) {
                    player1.points += 20;
                }
                else if(player1.results[i][0] + player1.results[i][1] == 10){
                    player1.points += 15;
                }
                else {
                    player1.points += (player1.results[i][0] + player1.results[i][1]);
                }

                if(player2.results[i][0] == 10) {
                    player2.points += 20;
                }
                else if(player2.results[i][0] + player2.results[i][1] == 10){
                    player2.points += 15;
                }
                else {
                    player2.points += (player2.results[i][0] + player2.results[i][1]);
                }

                System.out.format("%n%-20s%s%-20d%s%-20d%s%d%s%d", player1.name, "Throw 1 - ", player1.results[i][0], "Throw 2 - ", player1.results[i][1], "Total points after frame ", (i+1), " - ", player1.points);
                System.out.format("%n%-20s%s%-20d%s%-20d%s%d%s%d%n", player2.name, "Throw 1 - ", player2.results[i][0], "Throw 2 - ", player2.results[i][1], "Total points after frame ", (i+1), " - ", player2.points);

            }

            if(player1.points > player2.points) {
                System.out.println("\n" + player1.name + ", you win!");
            }
            else if(player2.points > player1.points) {
                System.out.println("\n" + player2.name + ", you win!");
            }
            else {
                System.out.println("\nIt's a tie!");
            }

        }
    }
}
