package DemoPack;

public class FootballPlayer {

    private String playerName;
    private int point;

    public FootballPlayer(String playerName, int point) {
        this.playerName = playerName;
        this.point = point;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPoint() {
        return point;
    }

    @Override
    public String toString() {
        return String.format("%s: %s ", playerName, point);
    }

    public void setPoint(int point) {
        this.point = point;
    }

}

