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
        LinkedList<String[]> temp = new LinkedList<>();
        LinkedList<String[]> copyTemp = new LinkedList<>();
        LinkedList<String> list = new LinkedList<>();
        Deque<LinkedList<String>> deque = new LinkedList<>();


        String line;

        while((line= br.readLine()) != null) {
            String[] names = line.split(",");
            temp.add(names);
            copyTemp.add(names);
        }
        copyTemp.remove(0);

        Knee k = new Knee();
        for(String[] str: temp){
            if(str[0].equals("NULL")){
                k.addNode(str[0], str[1]);
                list.add(str[1]);
                copyTemp.remove(str);
            }
        }
        tree.add(k);
        deque.add(list);

        while(!copyTemp.isEmpty()){
            Knee knee = new Knee();
            LinkedList<String> t = new LinkedList<>();

            for(String[] str: temp){
                if(deque.getLast().contains(str[0])){
                    knee.addNode(str[0], str[1]);
                    t.add(str[1]);
                    copyTemp.remove(str);
                }
            }
            tree.add(knee);
            deque.add(t);
        }
        return tree;

    }
}
