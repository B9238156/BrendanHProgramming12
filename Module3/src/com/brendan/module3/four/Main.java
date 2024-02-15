package com.brendan.module3.four;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintStream;


public class Main {
    public static ArrayList<PlayerBattingStats> players;

    /**
     * Takes in a comma sperated values file and parses the data.  It takes the data and
     * creates a PlayerBattingStats object and adds it to the players list.  The CSV file
     * must be in the format of:
     * Name,Team,Gamesplayed,At bats, runs, hits, doubles, triples, home runs, rbi's
     * @param file containg the data
     */
    public static void parseCSVData(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] splitter = line.split(",");
            String name = splitter[0];
            String team = splitter[1];
            int gamesPlayed = Integer.parseInt(splitter[2]);
            int atBats = Integer.parseInt(splitter[3]);
            int runs = Integer.parseInt(splitter[4]);
            int hits = Integer.parseInt(splitter[5]);
            int doubles = Integer.parseInt(splitter[6]);
            int triples = Integer.parseInt(splitter[7]);
            int homeRunes = Integer.parseInt(splitter[8]);
            int rbis = Integer.parseInt(splitter[9]);
            players.add(new PlayerBattingStats(name, team, gamesPlayed, atBats, runs, hits, doubles, triples, homeRunes, rbis));
        }

    }

    public static void main(String[] args) throws IOException {
        players = new ArrayList<>();
        ArrayList<PlayerBattingStats> result = new ArrayList<>();
        try {
            parseCSVData(new File("C:\\GitHub\\BrendanHProgramming12\\Module3\\PlayerData.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (PlayerBattingStats player : players) {
            System.out.println(player);
        }

        File outputFile = new File("BattingStats.txt");

        PrintStream stream = new PrintStream(outputFile);
        System.setOut(stream);

        System.out.println("\n By runs= ");
        result = PlayerSorter.sort(players, PlayerSorter.RUNS);
        for (PlayerBattingStats player : result) {
            System.out.println(player);
        }
        System.out.println("\n By games= ");
        result = PlayerSorter.sort(players, PlayerSorter.GAMESPLAYED);
        for (PlayerBattingStats player : result) {
            System.out.println(player);
        }
        System.out.println("\nBy at bats= ");
        result = PlayerSorter.sort(players, PlayerSorter.ATBATS);
        for (PlayerBattingStats player : result) {
            System.out.println(player);
        }
        System.out.println("\nBy percent runs= ");
        result = PlayerSorter.sort(players, PlayerSorter.PERCENTRUNS);
        for (PlayerBattingStats player : result) {
            System.out.println(player);
        }
        System.out.println("\nBy percent on base= ");
        result = PlayerSorter.sort(players, PlayerSorter.PERCENTONBASE);
        for (PlayerBattingStats player : result) {
            System.out.println(player);
        }
    }

}