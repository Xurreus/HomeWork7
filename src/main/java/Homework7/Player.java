package Homework7;

public class Player {
    private String name;
    private double endurance;
    private double sprint;
    private double dribble;
    private double passing;
    private double shooting;

    public Player(String name, double endurance, double sprint, double dribble, double passing, double shooting,
                  double stat6, double stat7, double stat8, double stat9) {
        this.name = name;
        this.endurance = validateStat(endurance);
        this.sprint = validateStat(sprint);
        this.dribble = validateStat(dribble);
        this.passing = validateStat(passing);
        this.shooting = validateStat(shooting);

    }
    private double validateStat(double stat) {
        return (stat >= 0 && stat <= 100) ? stat : 0;
    }

    public double calculateSkillLevel() {
        double totalStats = endurance + sprint + dribble + passing + shooting ;
        return totalStats / 9.0;
    }
    public String getName() {
        return name;
    }
}
