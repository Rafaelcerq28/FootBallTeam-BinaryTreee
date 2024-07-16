package TreeClass;

public class FootballTeam implements Comparable<FootballTeam>{
    
    private String teamName;
    private double budget;
    private int position;
    
    public FootballTeam(String teamName, double budget, int position) {
        this.teamName = teamName;
        this.budget = budget;
        this.position = position;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public int compareTo(FootballTeam otherTeam) {
        return Integer.compare(this.position, otherTeam.position);
    }

    @Override
    public String toString() {
        return "FootballTeam [teamName=" + teamName + ", budget=" + budget + ", position=" + position + "]";
    }


    
}

