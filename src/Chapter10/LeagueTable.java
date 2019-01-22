package Chapter10;

import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable<T extends Team> {
    private ArrayList<T> teams;

    public LeagueTable() {
        this.teams = new ArrayList<>();
    }

    public boolean addTeam(T team) {
        if (alreadyInLeague(team)) {
            System.out.println(team.getName() + " already exists in league list");
            return false;
        }
        teams.add(team);
        return true;
    }

    private boolean alreadyInLeague(T team) {
        for (T i : teams) {
            if (i == team) {
                return true;
            }
        }
        return false;
    }

    public void printOrderedList() {
        Collections.sort(teams);
        for (T i : teams) {
            System.out.println(i.getName() + " : " + i.getScore());
        }
    }
}
