package Homework7;
import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    public double calculateTeamRating() {
        double totalSkillLevel = 0;
        for (Player player : players) {
            totalSkillLevel += player.calculateSkillLevel();
        }
        return totalSkillLevel / players.size();
    }

    public String getName() {
        return name;
    }

    public List<Player> getPlayers() {
        return players;
    }
}
