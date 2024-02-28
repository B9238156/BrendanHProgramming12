import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.*;
import java.util.Arrays;



public class Main {
    public static DatabaseHandler handler;

    /**
     * Load Data from CSV
     */
    public static void loadData() {
        try (
                Reader playerData = Files.newBufferedReader(Paths.get("PlayerData.csv"));
                CSVParser csvParser = new CSVParser(playerData, CSVFormat.DEFAULT
                        .withHeader("Name","Team","Gamesplayed","Atbats", "Runs", "Hits", "Doubles", "Triples", "HomeRuns", "Rbis")
                        .withSkipHeaderRecord()
                        .withIgnoreHeaderCase()
                        .withTrim());

        ) {
            //Name,Team,Gamesplayed,Atbats, runs, hits, doubles, triples, homeRuns, rbis
            for (CSVRecord csvRecord : csvParser) {
                // Accessing Values by Column Index
                String name = csvRecord.get(0);
                String team = csvRecord.get(1);
                String gamesPlayed = csvRecord.get(2);
                String atBats = csvRecord.get(3);
                String runs = csvRecord.get(4);
                String hits = csvRecord.get(5);
                String doubles = csvRecord.get(6);
                String triples = csvRecord.get(7);
                String homeRuns = csvRecord.get(8);
                String rbis = csvRecord.get(9);

                String qu = "INSERT INTO PLAYERSTATS VALUES (" +
                        "'" + name + "'," +
                        "'" + team + "'," +
                        + Integer.valueOf(gamesPlayed) + "," +
                        + Integer.valueOf(atBats) + "," +
                         + Integer.valueOf(runs) + "," +
                         + Integer.valueOf(hits) + "," +
                         + Integer.valueOf(doubles) + "," +
                         + Integer.valueOf(triples) + "," +
                         + Integer.valueOf(homeRuns) + "," +
                         + Integer.valueOf(rbis) + ")";
                        handler.insertAction(qu);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void main(String[] args) {
        handler = DatabaseHandler.getHandler();

        loadData();
        try {
            writeToFile(handler);
        } catch (IOException throwables) {
            throwables.printStackTrace();
        }
    }

    /**
     * Create CSV file, write headers into file, Write resultset from database to OutputofPlayerData.csv, Catch IOException
     * @param handler
     * @throws IOException
     */
    public static void writeToFile(DatabaseHandler handler) throws IOException {
        try (
            //Create the file
            BufferedWriter writer = Files.newBufferedWriter(Paths.get("outputofPlayerData.csv"));
            //write headers into file
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
                    .withHeader("Name","Team","Gamesplayed","Atbats", "runs", "hits", "doubles", "triples", "homeRuns", "rbis"));
        ){
            String qu = "SELECT * FROM PLAYERSTATS";
            ResultSet resultSet = handler.selectResults(qu);

            try {
                while (resultSet.next()) {
                    //Load the record into varibles
                    String name = resultSet.getString("NAME");
                    String team = resultSet.getString("TEAM");
                    int gamesPlayed = resultSet.getInt("GAMESPLAYED");
                    int atbats = resultSet.getInt("ATBATS");
                    int runs = resultSet.getInt("RUNS");
                    int hits = resultSet.getInt("HITS");
                    int doubles = resultSet.getInt("DOUBLES");
                    int triples = resultSet.getInt("TRIPLES");
                    int homeruns = resultSet.getInt("HOMERUNS");
                    int rbis = resultSet.getInt("RBIS");

                    //Write out to CSV
                    csvPrinter.printRecord(name, team, gamesPlayed, atbats, runs, hits, doubles, triples, homeruns, rbis);
                }
            }catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            csvPrinter.flush();
        }


    }
}