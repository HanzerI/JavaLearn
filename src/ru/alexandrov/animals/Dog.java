package ru.alexandrov.animals;

import ru.alexandrov.main.Gavable;

public class Dog implements Gavable {
    private String name;
    private Gavable g;

    public Dog(String name,Gavable g) {
        this.name = name;
        this.g = g;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void gav(){
        g.gav();
    }


    @Override
    public String toString() {
        return "Собака: "+ name;
    }

}
