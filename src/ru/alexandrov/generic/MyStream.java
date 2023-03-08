package ru.alexandrov.generic;

import ru.alexandrov.main.*;

import java.util.*;

public class MyStream<T>{
    public List<T> list;
    private List<Actionable<T>> acts = new ArrayList<>();

    public MyStream(List<T> list) {
        this.list = list;
    }
    public MyStream() {
    }

    public List<T> getList() {
        return list;
    }


    public <P> MyStream<P> map(Applable<T,P> ap ){
        acts.add((x,i)->{
            i++;
            if(x == null) return null;
            if(i>= acts.size()) return ap.apply(x);
            return acts.get(i).act((T)ap.apply(x),i);
        });
        return (MyStream<P>) this;
    }

    public MyStream<T> filter(Testabale<T> ts ){

        acts.add((x,i)->{
            i++;
            if (i>= acts.size()) {
                if( ts.test(x))
                    return x;
                return null;
            }
            if(ts.test(x) )
                return acts.get(i).act(x,i);

            return null;
        });
        return this;
    }


    public  <R> R reduce(R defaultValue, Sumable<T,R> sm ){
        R result = defaultValue;
        T val;
       A: for (T t : list) {
            val =(T)acts.get(0).act(t,0);
            if(val!= null)
                result = sm.act(result, val);
        }
        return result;
    }

    public <P extends  Collection<T>> P collect( P collection, MyCollector<T,P> col){
        T val;
        for (T value:list) {
            val =(T)acts.get(0).act(value,0);
            if(val!=null)
                collection = col.collect( val,collection);
        }
        return collection;
    }

}
