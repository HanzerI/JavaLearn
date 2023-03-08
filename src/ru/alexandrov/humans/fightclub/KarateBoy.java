package ru.alexandrov.humans.fightclub;

import ru.alexandrov.main.Action;

public class KarateBoy {
    private String name;

    public KarateBoy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void foot(){
        System.out.println("XYA");
    }

    public void hand(){
        System.out.println("KIA");
    }

    public void jump(){
        System.out.println("VJUH");
    }


}
