package ru.alexandrov.main;

public interface Actionable<T> {
    Object act(T t,int i);
}
