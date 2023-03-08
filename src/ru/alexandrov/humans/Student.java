package ru.alexandrov.humans;

import ru.alexandrov.main.Action;
import ru.alexandrov.main.Saveable;
import ru.alexandrov.main.Testabale;

import java.util.*;

public class Student<T>  {

    private  String name;
    private Deque<Action> acts = new ArrayDeque<>();
    private List<T> evaluations;
    private Testabale<T> rule = x -> true;

    public Student(Testabale<T> rule,String name) {
        if(name == null || name.length()== 0 ) throw new IllegalArgumentException("Пустая строка");
        this.rule =rule;
        this.name = name;
    }



    public Student(String name) {
        if(name == null || name.length()== 0 ) throw new IllegalArgumentException("Пустая строка");
        this.name = name;
    }

    public Student(Testabale<T> rule,String name,T ... evaluations) {
        this(rule,name);
        this.evaluations= new ArrayList<>();
        if(evaluations != null){
            for (T e : evaluations) {
                if (!rule.test(e)) throw new IllegalArgumentException("Неверная оценка");
                this.evaluations.add(e);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String name2 = this.name;
        this.acts.push(()->setName(name2));
        this.name = name;
    }


    public void setEvaluations(List<T>  evaluations) {
        List<T> lst = this.evaluations;
        this.acts.push(()->setEvaluations((List.copyOf(lst))));
        this.evaluations= new ArrayList<>();
        if(evaluations != null){
            for (T e : evaluations) {
                if (!rule.test(e)) throw new IllegalArgumentException("Неверная оценка");
                this.evaluations.add(e);
            }
        }
    }



    public List<T> getEvaluations() {
        return new ArrayList<>(this.evaluations);
    }

    public void addEvaluation(T evaluation){
        if(! rule.test(evaluation)) return;
        if(this.evaluations == null){
            acts.push(()->setEvaluations(null));
            this.evaluations = new ArrayList<>();
        }
        acts.push(()->evaluations.remove(evaluation));
        this.evaluations.add(evaluation);
    }

//    public double averageGrades(){
//        if( this.evaluations.size() > 0) {
//            int aG = 0;
//            for(int i = 0; i < this.evaluations.size();i++){
//                aG += this.evaluations.get(i);
//            }
//            return (double) aG / this.evaluations.size();
//        }
//        return 0;
//    }


    public int compareTo(Student<T> o, Comparator<T> com) {
        int res = 0;
        for (int i = 0; i < o.evaluations.size();i++) {
            res += com.compare(this.evaluations.get(i),o.evaluations.get(i));
        }
        if( res > 0) return 1;
        if( res < 0) return -1;
        return 0;
    }



//    @Override
//    public int compare(Student obj) {
//        if(this.averageGrades() > obj.averageGrades()) return 1;
//        if(this.averageGrades() < obj.averageGrades()) return -1;
//        return 0;
//    }

    public void setEvaluation(int index, T evaluation){
         if (! rule.test(evaluation)) throw new IllegalArgumentException("Не та оценка");
         this.evaluations.set(index,evaluation);
    }

    public boolean isExcellent(T ex){
        if(evaluations == null || evaluations.size() == 0)
            return  false;
        return evaluations.stream().allMatch(x->x==ex);
    }

    public void undo(){
        acts.pop().act();
    }

    private class Save implements Saveable {
        private List evaluations;
        private String name;

        private Save(){
            this.name = Student.this.getName();
            this.evaluations = Student.this.getEvaluations();
        }

        public void load(){
            Student.this.name = this.name;
            Student.this.evaluations = this.evaluations;
        }

    }


    @Override
    public String toString() {
        return name  + evaluations;
    }

}
