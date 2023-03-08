package ru.alexandrov.animals;

import ru.alexandrov.main.Meowable;

public class Cat implements Meowable {
    public String name;
    private Meowable m;

    public Cat(String name,Meowable m){
        this.name = name;
        this.m = m;
    }

    public String toString() {
        return "Кот: " + name;
    }

    public void meow(){
        m.meow();
    }

    public void meow(int n){
        String m = "";
        for(int i = 0;i < n; i++)
            m+=" мяу";
        System.out.println(name+m+"!");
    }

}
