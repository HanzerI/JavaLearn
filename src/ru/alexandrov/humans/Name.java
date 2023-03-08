package ru.alexandrov.humans;

import java.util.ArrayList;
import java.util.List;

//----------------------------------Задание 1.2.3 (Имена)-------------------------------------------------------------------
public class Name {

    public final String firstName;
    public final String secondName;
    public final String patronymic;
    private static List<Name> pull = new ArrayList<>();

//    private Name( String firstName){
//        this(firstName,null,null);
//    }
//
//    private Name(String firstName, String secondName){
//        this(firstName,secondName,null);
//    }

    private Name(String firstName, String secondName,String patronymic){
        if( notEmptyName(firstName,secondName,patronymic) )
        {
            this.firstName = firstName;
            this.secondName = secondName;
            this.patronymic = patronymic;
            pull.add(this);
        }
        else
            throw new IllegalArgumentException("Пустая строка");

    }

    public static Name Name(String firstName, String secondName,String patronymic){
        for (Name name: pull) {
            if(firstName.equals(name.firstName)  && secondName.equals(name.secondName)   && patronymic.equals(name.patronymic))
                return name;
        }
        return new Name(firstName,secondName,patronymic);
    }

    public static Name Name(String firstName, String secondName){
       return Name(firstName,secondName,null);
    }
    public static Name Name(String firstName){
       return Name(firstName,null,null);
    }
    public static Name Name(Name name){
       return Name(name.firstName,name.secondName, name.patronymic);
    }

    private boolean notEmptyName(String firstName, String secondName,String patronymic){
        if(( firstName == null || firstName.length() == 0) &&
                ( secondName == null || secondName.length() == 0) &&
                ( patronymic == null || patronymic.length() == 0))
            return false;
        return true;
    }



    public String toString(){
        String str="";
        if(firstName != null) str += firstName;
        if(patronymic != null) str +=  " " + patronymic ;
        if(secondName != null) str += " " +secondName;
        return str;
    }
}
