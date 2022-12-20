package org.example;


import java.io.IOException;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) throws IOException {

        FillTree fl = new FillTree();
        ArrayList<Knee> tree = new ArrayList<>();
        tree = fl.fill("/home/vildan/IdeaProjects/OOP_Java/Seminar02_Homework/tree.csv");

        PrintTree.print(tree);
//        Find.findCousins(tree, "Petrova Liza");
//        Find.findGrands(tree, "Ivanova Pavel");
//        Find.findBroSis(tree, "Sidorova Maria");
//        Find.findChild(tree, "Ivanova Alla");

    }
}