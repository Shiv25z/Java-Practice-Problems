package com.oopsconcept;

public class ThiskeyWord {
    int i =10;

    public ThiskeyWord() {
        this.i = i;
    }

    public ThiskeyWord(String s){
        this();
        System.out.println(s);
    }
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        ThiskeyWord obj = new ThiskeyWord();
        obj.setI(0  );
        System.out.println(obj.getI());


    }
}
