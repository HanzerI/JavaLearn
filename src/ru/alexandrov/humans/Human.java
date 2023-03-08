package ru.alexandrov.humans;

public class Human {

    public final Human father;
    public Name name;
    private int height;
    private boolean sex;

    public Human(Name name, int height, Human father, boolean sex){
        this.setHeight(height);
        this.father = father;
        this.sex = sex;
        if(name.secondName == null && name.patronymic== null){
            this.name = Name.Name(name.firstName,createSecondName(this),createPatronymic(this));
        }
        else if (name.secondName == null)
        {
            this.name = Name.Name(name.firstName,createSecondName(this),name.patronymic);
        }
        else if(name.patronymic== null){
            this.name = Name.Name(name.firstName,name.secondName,createPatronymic(this));
        }
        else this.name = name;
    }



    public Human(String name, int height, Human father, boolean sex){
        this(Name.Name(name),height,father,sex);
    }

    public Human(Name name, int height, boolean sex){
        this(name,height,null,sex);
    }

    public Human(String name, int height, boolean sex){
        this(name,height,null,sex);
    }


    public Human getFather() {
        return this.father;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(height < 0 || height > 500 ) throw new IllegalArgumentException("Рост должен быть от 0 до 500");
        this.height = height;
    }

    private static String createSecondName(Human human){
        if(human.father != null && human.father.name.secondName != null)
            if(human.sex)
                return human.father.name.secondName;
            else
                return human.father.name.secondName + "a";
         return null;
    }

    private static String createPatronymic(Human human){
        if(  human.father != null && human.father.name.patronymic != null){
            if(human.sex){
                if(human.father.name.firstName.equals("Борис"))
                    return  "Борисович";
                else if(human.father.name.firstName.equals("Данила"))
                   return  "Данилович";
                else if(human.father.name.firstName.equals("Пётр"))
                    return  "Петрович";
                else if(human.father.name.firstName.charAt(human.father.name.firstName.length()-1) == 'й' || human.father.name.firstName.charAt(human.father.name.firstName.length()-1) == 'ь')
                    return  (human.father.name.firstName.substring(0,human.father.name.firstName.length()-1) + "евич");
               else if (human.father.name.firstName.charAt(human.father.name.firstName.length()-1) == 'а' || human.father.name.firstName.charAt(human.father.name.firstName.length()-1) == 'я')
                    return (human.father.name.firstName.substring(0,human.father.name.firstName.length()-1) + "ич");
               else  return (human.father.name.firstName.substring(0,human.father.name.firstName.length()-1) + "ович");
            }

            else {
                if(human.father.name.firstName.equals("Борис"))
                    return  "Борисовна";
                else if(human.father.name.firstName.equals("Данила"))
                    return  "Даниловна";
                else if(human.father.name.firstName.equals("Пётр"))
                    return  "Петровна";
                else if(human.father.name.firstName.charAt(human.father.name.firstName.length()-1) == 'й' || human.father.name.firstName.charAt(human.father.name.firstName.length()-1) == 'ь')
                    return  (human.father.name.firstName.substring(0,human.father.name.firstName.length()-1) + "евна");
                else if (human.father.name.firstName.charAt(human.father.name.firstName.length()-1) == 'а' || human.father.name.firstName.charAt(human.father.name.firstName.length()-1) == 'я')
                    return (human.father.name.firstName.substring(0,human.father.name.firstName.length()-1) + "ична");
                else  return (human.father.name.firstName.substring(0,human.father.name.firstName.length()-1) + "овна");
            }
        }
        return null;
    }

    public String toString(){
        if(father == null)
            return name+", рост: "+height;
        return name+", рост: "+height + ".Отец " + father.name;
    }

}
