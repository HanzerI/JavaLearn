package ru.alexandrov.storages;

public class Box<T> {
    private T t;


    public Box() {
    }
    public Box(T t) {
        this.t = t;
    }

    public T getT() {
        T rT = t;
        t = null;
        return rT;
    }

    public void setT(T t) {
        if(isFilled()) throw new IllegalArgumentException("Bucket is not empty");
        this.t = t;
    }

    public boolean isFilled(){
        return (this.t != null);
    }
}
