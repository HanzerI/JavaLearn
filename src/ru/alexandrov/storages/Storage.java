package ru.alexandrov.storages;

public class Storage <T>{
    private final T value;

    private Storage(T t) {
        this.value = t;
    }

    public static <T> Storage<T> nullStorage(T t,T def){
        return new Storage<T>(t);
    }
    public static <T> Storage<T> Storage(T t){
        if(t == null ) throw new IllegalArgumentException("Значения не должны быть равны нулю");
        return new Storage<T>(t);
    }

    public T orElse(T def) {
        if(value == null) return def;
        return value;
    }


}
