package com.brendan.module3.four;

import java.util.ArrayList;

/**
 * Class that takes in an ArrayList and sorts the players by various criteria
 * using a mergesort.
 */

public class PlayerSorter {
    //The following fields are the different sort types:
    public static int GAMESPLAYED = 0;
    public static int ATBATS = 1;
    public static int RUNS = 2;
    public static int PERCENTRUNS = 3; // Calculated by: runs/atBats
    public static int PERCENTONBASE = 4; // Calculated by (hits + doubles + triples) / atBats

    /**
     * This method is an interface that allows the sorting of a player given based on
     * certain criteria.  There are 5 options to sort a player which are by Games played,
     * at bats, runs, percent runs, percent on base.
     * The sort is in descending order (Largest to smallest)
     * This method calls one of 5 private methods that will do the sort based on the chosen criteria.
     * @param list List of players containing the statistics
     * @param sortType How the user wants the players sorted.  The value should be chosed from one of
     *                 the 5 static fields from the class.
     * @return An ArrayList that is sorted according to the users specification.
     */
    public static ArrayList<PlayerBattingStats> sort(ArrayList<PlayerBattingStats> list, int sortType) {
        ArrayList<PlayerBattingStats> result = new ArrayList<>();

        if(list.size() <= 1){
            return list;
        }

        int midpoint = list.size() / 2;

        ArrayList<PlayerBattingStats> ls = new ArrayList<>();
        ArrayList<PlayerBattingStats> rs = new ArrayList<>();

        for (int i = 0; i < midpoint; i++){
            ls.add(list.get(i));
        }
        for (int i = midpoint; i < list.size(); i++){
            rs.add(list.get(i));
        }

        ls = sort(ls, sortType);
        rs = sort(rs, sortType);
        if(sortType == PlayerSorter.RUNS){
            result = mergeRuns(ls,rs);
        } else if (sortType == PlayerSorter.GAMESPLAYED) {
            result = mergeGames(ls,rs);
        } else if (sortType == PlayerSorter.ATBATS) {
            result = mergeAtBats(ls,rs);
        } else if (sortType == PlayerSorter.PERCENTRUNS) {
            result = mergePercentRuns(ls,rs);
        } else if (sortType == PlayerSorter.PERCENTONBASE) {
            result = mergeBasePercentage(ls, rs);
        }
        return result;
    }

    public static ArrayList<PlayerBattingStats> mergeRuns(ArrayList<PlayerBattingStats> ls, ArrayList<PlayerBattingStats> rs) {
        int leftPointer = 0, rightPointer = 0, resultPointer = 0;
        ArrayList<PlayerBattingStats> result = new ArrayList<>();

        // While there are items in either array...
        while (leftPointer < ls.size() || rightPointer < rs.size()){

            if (leftPointer < ls.size() && rightPointer < rs.size()){
                if (ls.get(leftPointer).getRuns() > rs.get(rightPointer).getRuns()){
                    result.add(ls.get(leftPointer));
                    resultPointer++;
                    leftPointer++;
                }
                else {
                    result.add(rs.get(rightPointer));
                    resultPointer++;
                    rightPointer++;
                }
            }

            else if (leftPointer < ls.size()) {
                    result.add(ls.get(leftPointer));
                    resultPointer++;
                    leftPointer++;
            }
            else if (rightPointer < rs.size()) {
                result.add(rs.get(rightPointer));
                resultPointer++;
                rightPointer++;
            }
        }
        return result;
    }

    public static ArrayList<PlayerBattingStats> mergeGames(ArrayList<PlayerBattingStats> ls, ArrayList<PlayerBattingStats> rs) {
        int leftPointer = 0, rightPointer = 0, resultPointer = 0;
        ArrayList<PlayerBattingStats> result = new ArrayList<>();

        // While there are items in either array...
        while (leftPointer < ls.size() || rightPointer < rs.size()){

            if (leftPointer < ls.size() && rightPointer < rs.size()){
                if (ls.get(leftPointer).getGames() > rs.get(rightPointer).getGames()){
                    result.add(ls.get(leftPointer));
                    resultPointer++;
                    leftPointer++;
                }
                else {
                    result.add(rs.get(rightPointer));
                    resultPointer++;
                    rightPointer++;
                }
            }

            else if (leftPointer < ls.size()) {
                result.add(ls.get(leftPointer));
                resultPointer++;
                leftPointer++;
            }
            else if (rightPointer < rs.size()) {
                result.add(rs.get(rightPointer));
                resultPointer++;
                rightPointer++;
            }
        }
        return result;
    }

    public static ArrayList<PlayerBattingStats> mergeAtBats(ArrayList<PlayerBattingStats> ls, ArrayList<PlayerBattingStats> rs) {
        int leftPointer = 0, rightPointer = 0, resultPointer = 0;
        ArrayList<PlayerBattingStats> result = new ArrayList<>();

        // While there are items in either array...
        while (leftPointer < ls.size() || rightPointer < rs.size()){

            if (leftPointer < ls.size() && rightPointer < rs.size()){
                if (ls.get(leftPointer).getAtBats() > rs.get(rightPointer).getAtBats()){
                    result.add(ls.get(leftPointer));
                    resultPointer++;
                    leftPointer++;
                }
                else {
                    result.add(rs.get(rightPointer));
                    resultPointer++;
                    rightPointer++;
                }
            }

            else if (leftPointer < ls.size()) {
                result.add(ls.get(leftPointer));
                resultPointer++;
                leftPointer++;
            }
            else if (rightPointer < rs.size()) {
                result.add(rs.get(rightPointer));
                resultPointer++;
                rightPointer++;
            }
        }
        return result;
    }

    public static ArrayList<PlayerBattingStats> mergePercentRuns(ArrayList<PlayerBattingStats> ls, ArrayList<PlayerBattingStats> rs) {
        int leftPointer = 0, rightPointer = 0, resultPointer = 0;
        ArrayList<PlayerBattingStats> result = new ArrayList<>();

        // While there are items in either array...
        while (leftPointer < ls.size() || rightPointer < rs.size()){

            if (leftPointer < ls.size() && rightPointer < rs.size()){
                if (ls.get(leftPointer).getPercentRuns() > rs.get(rightPointer).getPercentRuns()){
                    result.add(ls.get(leftPointer));
                    resultPointer++;
                    leftPointer++;
                }
                else {
                    result.add(rs.get(rightPointer));
                    resultPointer++;
                    rightPointer++;
                }
            }

            else if (leftPointer < ls.size()) {
                result.add(ls.get(leftPointer));
                resultPointer++;
                leftPointer++;
            }
            else if (rightPointer < rs.size()) {
                result.add(rs.get(rightPointer));
                resultPointer++;
                rightPointer++;
            }
        }
        return result;
    }

    public static ArrayList<PlayerBattingStats> mergeBasePercentage(ArrayList<PlayerBattingStats> ls, ArrayList<PlayerBattingStats> rs) {
        int leftPointer = 0, rightPointer = 0, resultPointer = 0;
        ArrayList<PlayerBattingStats> result = new ArrayList<>();

        // While there are items in either array...
        while (leftPointer < ls.size() || rightPointer < rs.size()){

            if (leftPointer < ls.size() && rightPointer < rs.size()){
                if (ls.get(leftPointer).getPercentOnBase() > rs.get(rightPointer).getPercentOnBase()){
                    result.add(ls.get(leftPointer));
                    resultPointer++;
                    leftPointer++;
                }
                else {
                    result.add(rs.get(rightPointer));
                    resultPointer++;
                    rightPointer++;
                }
            }

            else if (leftPointer < ls.size()) {
                result.add(ls.get(leftPointer));
                resultPointer++;
                leftPointer++;
            }
            else if (rightPointer < rs.size()) {
                result.add(rs.get(rightPointer));
                resultPointer++;
                rightPointer++;
            }
        }
        return result;
    }

}