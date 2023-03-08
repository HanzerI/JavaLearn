package ru.alexandrov.animals.birds;

public class Cuckoo extends Bird {

    public Cuckoo() {
        super("ку-ку");
    }

    @Override
    public void sing() {
        String txt = new String(sound);
        for(int i = (int)Math.random()  * 10; i < 10; i ++){
            txt += " " + sound;
        }
        System.out.println(txt);
    }

}
