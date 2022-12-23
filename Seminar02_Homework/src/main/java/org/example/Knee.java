package org.example;

import java.util.ArrayList;

/**
Класс поколение, хранит список узлов текущего поколения.
 */
public class Knee {
    ArrayList<Node> nodes;

    Knee(){
        nodes = new ArrayList<>();
    }

    Knee(String parent, String name){
        nodes = new ArrayList<>();
        nodes.add(0, new Node(parent, name));
    }

    public void addNode(String parent, String name){

        nodes.add(new Node(parent, name));
    }


    public ArrayList<Node> getList(){
        return this.nodes;
    }

    public void printKnee(){
        for(Node n: nodes){
            System.out.println(n.name);
        }
    }

    public boolean containsName(String text){
        for(Node n: nodes){
            if(n.name.equals(text)){
                return true;
            }
        }
        return false;
    }
}
