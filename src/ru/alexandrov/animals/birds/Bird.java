package ru.alexandrov.animals.birds;

public abstract class Bird {
    final String sound;

    public Bird(String sound) {
        this.sound =  new String(sound);
    }

    abstract public void sing();

    public final static void  singAll(Bird ... birds){
        for (Bird bird:birds) {
            bird.sing();
        }
    }

}
