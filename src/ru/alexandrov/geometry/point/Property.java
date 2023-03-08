package ru.alexandrov.geometry.point;

public class Property<T> {
    String name;
    T value;

    public Property(T value) {
        this.name = value.toString();
        this.value = value;
    }

    @Override
    public String toString() {
        return name;
    }
}
