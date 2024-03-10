package Homework7;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Jose", 25.32, 12.76, 17, 57, 90, 28, 95, 24, 0);
        Player player2 = new Player("Diego", 70, 67, 85, 76, 9, 87, 80, 27, 85);

        Team team = new Team("Real Madrid" + "");

        team.addPlayer(player1);
        team.addPlayer(player2);

        double teamRating = team.calculateTeamRating();

        System.out.println("Real Madrid rating:" + teamRating);

        for (Player player : team.getPlayers()) {
            System.out.println(player.getName() + ":" + player.calculateSkillLevel());
        }
    }
}
