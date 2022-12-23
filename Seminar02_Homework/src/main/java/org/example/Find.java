package org.example;

import java.util.ArrayList;

/**
 * Класс Find содержит методы для поиска по различным критериям
 */

public class Find {

    /**
     *findChild ищет всех детей
     */
    public static void findChild(ArrayList<Knee> list, String par){

        for (Knee k: list){
            for (Node n: k.getList()){
                if(n.parent.equals(par)){
                    System.out.println(n.name);
                }
            }
        }
    }

    /**
     *findBroSis ищет родных братьев и сестёр
     */

    public static void findBroSis(ArrayList<Knee> list, String name){

        for (Knee k: list){
            for (Node n: k.getList()){
                if(n.name.equals(name)){
                    findChild(list, n.parent);
                }
            }

        }
    }

    /**
     *findCousins ищет родных и двоюродных братьев и сестёр
     */
    public static void findCousins(ArrayList<Knee> list, String name){

        for (Knee k: list){
            if (k.containsName(name)){
                k.printKnee();
                break;
            }
        }
    }

    /**
     *findGrands ищет бабушек и дедушек
     */

    public static void findGrands(ArrayList<Knee> list, String name){

        String dad = null;

        for (Knee k: list){
            for (Node n: k.getList()){
                if(n.name.equals(name)){
                    dad = n.parent;
                }
            }
        }

        for (Knee k: list){
            for (Node n: k.getList()){
                if(n.name.equals(dad)){
                    System.out.println(n.parent);
                }
            }
        }

    }


}
