package ru.alexandrov.other;

//----------------------------------Задание 1.1.4 (Время)-------------------------------------------------------------------
public class Time {
    public final int seconds;

    public Time(int seconds){
        if (seconds< 0) throw new IllegalArgumentException("seconds must be positive");
        final int SECOND_IN_HOUR = 3600;
        this.seconds = seconds % (SECOND_IN_HOUR * 24);
    }

    public Time(int hours, int minutes, int seconds){
        this(hours * 3600 + minutes * 60 + seconds);
    }


    public String toString(){
        final int SECOND_IN_MINUTE = 60;
        int hours = isHours();
        int minutes = isMinutes() % SECOND_IN_MINUTE ;
        return hours + ":" + minutes + ":" + isSeconds();
    }
    public int isHours(){
        final int SECOND_IN_HOUR = 3600;
        return  this.seconds / SECOND_IN_HOUR;
    }

    public int isMinutes(){
        final int SECOND_IN_MINUTE = 60;
        return  this.seconds / SECOND_IN_MINUTE;
    }

    public int isSeconds(){
        final int SECOND_IN_MINUTE = 60;
        return this.seconds % SECOND_IN_MINUTE;
    }

}
