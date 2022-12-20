package org.example;



public class Node {
    public String name, parent;


    public Node(String parent, String name){
        this.name = name;
        this.parent = parent;
    }

    public String getName(){
        return this.name;
    }
}
