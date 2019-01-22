package Chapter10;

import org.jetbrains.annotations.NotNull;

public abstract class Team implements Comparable<Team> {
    private String name;
    private int score;

    public Team(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(@NotNull Team o) {
        if (this.score < o.getScore()){
            return 1;
        } else if (this.score > o.getScore()) {
            return -1;
        }
        return 0;
    }
}
