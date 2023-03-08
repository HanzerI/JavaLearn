package ru.alexandrov.animals;

import ru.alexandrov.main.Gavable;
import ru.alexandrov.main.Meowable;

public class CatDog implements Meowable, Gavable {
    private final Dog dog;
    private final Cat cat;

    public CatDog(Dog dog, Cat cat) {
        this.dog = dog;
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public Cat getCat() {
        return cat;
    }

    @Override
    public void gav() {
        dog.gav();
    }

    @Override
    public void meow() {
        cat.meow();
    }
}
