package org.example;


import java.io.IOException;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) throws IOException {

        FillTree fl = new FillTree();
        ArrayList<Knee> tree;
        tree = fl.fill("/home/vildan/IdeaProjects/OOP_Java/Seminar02_Homework/tree.csv");

        PrintTree.print(tree);
//        Find.findCousins(tree, "Ivanova Alla");
//        Find.findGrands(tree, "Petrov Ivan");
//        Find.findBroSis(tree, "Ivanova Alla");
//        Find.findChild(tree, "Volkova Elena");

    }
}