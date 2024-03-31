package org.task13_15;

import java.util.ArrayList;

public class Animals {
    private int id;

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList getComands() {
        return this.comands;
    }

    private String name;
    private ArrayList comands = new ArrayList<String>();

    public Animals(int id, String name, ArrayList comands) {
        this.id = id;
        this.name = name;
        this.comands = comands;
    }

    public void addComand (String input){
        this.comands.add(input);
    }
}
