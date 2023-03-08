package ru.alexandrov.humans.fightclub;

import ru.alexandrov.main.Action;
import ru.alexandrov.main.Comboable;

import java.util.ArrayList;
import java.util.List;

public class Combo {
    public List<Comboable> hits = new ArrayList<>();

    public void make(KarateBoy kb){
        for (Comboable a: hits) {
            a.hit(kb);
        }
    }

}
