package com.brendan.module3.three;

import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Node> graph;

    public static void main(String[] args) throws FileNotFoundException {
        LinkedList<Integer> queue = new LinkedList<>();
        setupTree();
        Node node = graph.get(0);
        queue.add(node.getKey());
        List<Integer> values = node.getNodes();
        for (int i = 0; i < values.size(); i ++) {
            queue.add(values.get(i));
        }
        BFS(queue);
        System.out.println(queue);
    }

    private static void BFS(LinkedList<Integer> queue) {
        //Your code here.  Feel free to modify signature or add helper functions.
        LinkedList<Integer> tempQueue = (LinkedList<Integer>) queue.clone();
        boolean vistedAll = true; //Say we visited them all.
        for (int i = 0; i < tempQueue.size(); i++) {
            Integer parseKey = tempQueue.get(i) - 1; // Subtract 1 because they start at 0
            Node currNode = graph.get(parseKey);
            if (!currNode.isVisited()) {
                List<Integer> values = currNode.getNodes();
                for (int x = 0; x < values.size(); x ++) {
                    if (queue.indexOf(values.get(x)) == -1){
                        queue.add(values.get(x));
                    }
                }
                currNode.setVisited(true);
                vistedAll = false; // I now haven't visited them all.
            }
        }
        if (vistedAll == true){
            return; //This means I have visited all the nodes.
        }
        BFS(queue);
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
