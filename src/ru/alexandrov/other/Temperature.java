package ru.alexandrov.other;

public class Temperature implements Comparable<Temperature> {
    private String name;
    private int value;

    public static final Temperature COLD = new Temperature("Холодно",-30) ;
    public static final Temperature NORMAl =new Temperature("Нормально",15);
    public static final Temperature HOT =new Temperature("Жарко",35);


    private Temperature(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public static Temperature getTemperature(int value){
        if(value >= -50 && value <=10)   return COLD;
        else if(value > 10 && value <= 25) return  NORMAl;
        else if(value > 25  && value <= 60) return  HOT;
        throw new IllegalArgumentException("Нет такой темературы");
    }


    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }


    @Override
    public int compareTo(Temperature t) {
        return this.value - t.value;
    }

    @Override
    public int hashCode() {
        return 27*name.hashCode();
    }


    @Override
    public String toString() {
        return name + ':' +  value;
    }
}
