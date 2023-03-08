package ru.alexandrov.animals.birds;

public class Sparrow extends Bird{
    public Sparrow() {
        super("чырык");
    }

    @Override
    public void sing() {
        System.out.println(sound);
    }
}
