package com.brendan.module3.four;

/**
 * This class represents a players batting statistics.  The following are definitions of the stats
 * games -> Games played
 * atBAts -> Number of times a player has batted
 * runs -> Number of times a player reached home base
 * hits -> Number of times the player the ball and reached first base
 * doubles -> Number of times the player the ball and reached second base
 * triples -> Number of times the player the ball and reached second base
 * homeRuns -> Number of times the player got a home run
 * rbi -> Number of times the player got on base and allowed another runner to score
 */

public class PlayerBattingStats {
    private String name;
    private String team;
    private int games;
    private int atBats;
    private int runs;
    private int hits;
    private int doubles;
    private int triples;
    private int homeRuns;
    private int rbi;

    private double percentRuns;

    public double getPercentRuns() {
        return percentRuns;
    }

    public void setPercentRuns(double percentRuns) {
        this.percentRuns = percentRuns;
    }

    public double getPercentOnBase() {
        return percentOnBase;
    }

    public void setPercentOnBase(double percentOnBase) {
        this.percentOnBase = percentOnBase;
    }

    private double percentOnBase;

    /**
     *
     * @param name = Name of Player
     * @param team = Team Player is on
     * @param games = Number of games played by player
     * @param atBats = Number of at bats by player
     * @param runs = Number of runs drove in by player
     * @param hits = NUmber of hits by player
     * @param doubles = Number of doubles
     * @param triples = Number of triples
     * @param homeRuns = Number of home runs
     * @param rbi = Number of rbis
     * percentRuns = Percentage of runs by player (Expressed in double to correctly calculate a percentage with decimals.)
     * percentOnBase = Percentage on base by player (Expressed in double to correctly calculate a percentage with decimals.)
     */
    public PlayerBattingStats(String name, String team, int games, int atBats, int runs, int hits, int doubles, int triples, int homeRuns, int rbi) {
        this.name = name;
        this.team = team;
        this.games = games;
        this.atBats = atBats;
        this.runs = runs;
        this.hits = hits;
        this.doubles = doubles;
        this.triples = triples;
        this.homeRuns = homeRuns;
        this.rbi = rbi;
        this.percentRuns = (double)runs / (double)atBats * 100;
        this.percentOnBase = ((double)hits + (double)doubles + (double)triples) / (double)atBats * 100;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public int getGames() {
        return games;
    }

    public int getAtBats() {
        return atBats;
    }

    public int getRuns() {
        return runs;
    }

    public int getHits() {
        return hits;
    }

    public int getDoubles() {
        return doubles;
    }

    public int getTriples() {
        return triples;
    }

    public int getHomeRuns() {
        return homeRuns;
    }

    public int getRbi() {
        return rbi;
    }

    @Override
    public String toString() {
        return "PlayerBattingStats{" +
                "name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", games=" + games +
                ", atBats=" + atBats +
                ", runs=" + runs +
                ", hits=" + hits +
                ", doubles=" + doubles +
                ", triples=" + triples +
                ", homeRuns=" + homeRuns +
                ", rbi=" + rbi +
                ", % runs=" + String.format("%.2f", percentRuns)+
                ", % onBase=" + String.format("%.2f", percentOnBase)+
                '}';
    }
}