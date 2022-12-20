package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Класс FillTree читает из файла информацию по родителям и детям и формирует дерево
 */

public class FillTree {

    public ArrayList<Knee> fill(String filename) throws IOException {

        ArrayList<Knee> tree = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        ArrayList<String[]> temp = new ArrayList<>();
        Deque<LinkedList<String>> parents = new LinkedList<>();
        LinkedList<String> link = new LinkedList<>();


        String line;

        while((line= br.readLine()) != null) {
            String[] names = line.split(",");
            temp.add(names);
        }


        for(String[] str: temp){
            if(str[0].equals("NULL")){
                Knee knee = new Knee();
                knee.addNode(str[0], str[1]);
                tree.add(knee);
                link.add(str[1]);
                parents.add(link);
            }
        }

        int i = 0;

        while(i < temp.size()){
            Knee knee = new Knee();
            LinkedList<String> t = new LinkedList<>();

            for(String[] str: temp){
                if(parents.getLast().contains(str[0])){
                    knee.addNode(str[0], str[1]);
                    t.add(str[1]);
                }
            }
            i++;
            tree.add(knee);
            parents.addLast(t);
        }
        return tree;

    }
}
