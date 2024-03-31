package org.task13_15;

public class Counter implements AutoCloseable {
    static int i = 0;


    public void add() {
        i ++;
    }

    public void close() {
        System.out.println("Counter closed");
    }

    public int getAddedCounter(){
        add();
        return this.i;
    }
}
