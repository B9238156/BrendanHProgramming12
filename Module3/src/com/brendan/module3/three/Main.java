package com.brendan.module3.three;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Node> graph;

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Node> queue = new ArrayList<>();
        setupTree();
        BFS(queue);
        System.out.println(queue);
    }

    private static void BFS(ArrayList<Node> queue) {
        //Your code here.  Feel free to modify signature or add helper functions.
        for (int i = 0; i < graph.size(); i ++) {
            Node node = graph.get(i);
            System.out.println(node.getKey());
            queue.add(node);
        }
    }
    private static void setupTree() throws FileNotFoundException {
        graph = new ArrayList<>();
        Scanner scan = new Scanner(new File("C:\\GitHub\\BrendanHProgramming12\\Module3\\src\\com\\brendan\\module3\\three\\tree.txt"));
        while(scan.hasNext()){
            String line = scan.nextLine();
            parseLine(line);
        }

    }

    private static void parseLine(String line) {
        String[] keys = line.split(" ");
        int key = Integer.parseInt(keys[0]);
        ArrayList<Integer> points = new ArrayList<>();
        for(int i = 1; i < keys.length;i++){
            points.add(Integer.parseInt(keys[i]));
        }
        graph.add(new Node(key, points));
    }
}
