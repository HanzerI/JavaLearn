package ru.alexandrov.main;


import java.util.Collection;
import java.util.List;

public interface MyCollector<T,P extends Collection> {

    P collect(T value, P newList);


}



