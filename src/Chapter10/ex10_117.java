package Chapter10;

public class ex10_117 {
    public static void main(String[] args) {
        LeagueTable<FootballTeam> firstClass = new LeagueTable<>();
        FootballTeam genk = new FootballTeam("Genk", 5);
        FootballTeam club = new FootballTeam("Club Brugge", 4);
        FootballTeam antwerp = new FootballTeam("Antwerp", 10);
        FootballTeam shouldGiveError = antwerp;
        BaseballTeam yorkers = new BaseballTeam("Yorkers", 17);

        firstClass.addTeam(genk);
        firstClass.addTeam(club);
        firstClass.addTeam(antwerp);
        firstClass.addTeam(shouldGiveError);

//        firstClass.addTeam(yorkers);

        firstClass.printOrderedList();
    }
}
