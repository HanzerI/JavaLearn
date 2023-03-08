package ru.alexandrov.animals.birds;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Parrot extends Bird {

    public Parrot(String sound) {
        super(sound);
    }

    @Override
    public void sing() {
        String out = "";
        List<Integer> used = new ArrayList<>();
        int rnd = (int)(Math.random()  * sound.length());
        out += sound.charAt(rnd);
        used.add(rnd);
        int i = 1;
        while(i < sound.length())
        {
            rnd = (int)(Math.random()  * (sound.length()));
            if( !used.contains(rnd))
            {
                out += sound.charAt(rnd);
                used.add(rnd);
                i++;
            }
        }
        System.out.println(out);
    }
}
