package ru.alexandrov.other;

//----------------------------------Задание 1.1.5 (Дом)-------------------------------------------------------------------
public class House {
    final int floors;// Количество этажей

    public House(int floors){
        if(floors <= 0 ) throw new IllegalArgumentException("n must be positive");
        this.floors = floors;
    }


    public String toString(){
        if( floors % 10 == 1 && floors != 11 )
            return "Дом с "+ floors + " этажом";
        return "Дом с "+ floors + " этажами";
    }
}
