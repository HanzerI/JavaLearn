package ru.alexandrov.main;
import ru.alexandrov.animals.Cat;
import ru.alexandrov.city.*;
//import ru.alexandrov.generic.MyList;
import ru.alexandrov.database.DataBase;
import ru.alexandrov.generic.MyStream;
import ru.alexandrov.geometry.line.Line;
import ru.alexandrov.geometry.point.Point;
import ru.alexandrov.humans.Student;
import ru.alexandrov.humans.fightclub.Combo;
import ru.alexandrov.humans.fightclub.KarateBoy;
import ru.alexandrov.numbers.Fraction;
import ru.alexandrov.geometry.point.*;
import ru.alexandrov.animals.birds.*;
import ru.alexandrov.humans.employees.*;
import ru.alexandrov.humans.Name;

import static ru.alexandrov.numbers.Fraction.sum;

import ru.alexandrov.other.Time;
import ru.alexandrov.storages.Box;
import ru.alexandrov.storages.Storage;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args)throws CloneNotSupportedException{

//        ru.alexandrov.other.Time time = new ru.alexandrov.other.Time(180500);
//        System.out.println(time);
//        ru.alexandrov.humans.Student student1 = new ru.alexandrov.humans.Student("Вася",2,3,4,5);
//        ru.alexandrov.humans.Student student2 = new ru.alexandrov.humans.Student("Петя",student1.getEvaluations());
//        student1.setEvaluations(4);
//        System.out.println(student1);
//        System.out.println(student2);
//
//
//        List<String> lst = new ArrayList<>();
//        lst.add("Привет");
//        lst.add("Как дела?");
//        lst.add("Пока");
//        System.out.println(lst);
//        ru.alexandrov.other.House h = new ru.alexandrov.other.House(5);
//
//        ru.alexandrov.other.Time t1 = new ru.alexandrov.other.Time(89999);
//        System.out.println(t1);
//
//        ru.alexandrov.geometry.figures.Square sq = new ru.alexandrov.geometry.figures.Square(1,1,3);
//        sq.setSide(3);
//        System.out.println(sq.getSide());

//        ru.alexandrov.numbers.Fraction f1 = new ru.alexandrov.numbers.Fraction(25,5);
//        ru.alexandrov.numbers.Fraction f2 = new ru.alexandrov.numbers.Fraction(-16,5);
//        ru.alexandrov.numbers.Fraction f3 = new ru.alexandrov.numbers.Fraction(1,-5);
//
//        System.out.println(f1 + "+" + f2 +"=" + f2.sum(f1));
//        System.out.println(f1 + "-" + f2 +"=" + f2.sub(f1));
//        System.out.println(f1 + "*" + f2 +"=" + f2.mul(f1));
//        System.out.println(f1 + "/" + f2 +"=" + f2.div(f1));
//        System.out.println(f1.sum(f2).div(f3).sub(5));

//
//        ru.alexandrov.guns.Gun g = new ru.alexandrov.guns.Gun(0,7);
//        g.reload(3);
//        g.shoot();
//        g.shoot();
//        g.shoot();
//        g.shoot();
//        g.shoot();
//        g.reload(8);
//        g.shoot();
//        g.shoot();
//        g.discharge();
//        g.shoot();
//
//        ru.alexandrov.geometry.point.Point p1 =new ru.alexandrov.geometry.point.Point(1,1);
//        ru.alexandrov.geometry.point.Point p2 =new ru.alexandrov.geometry.point.Point(2,2);
//        ru.alexandrov.geometry.point.Point p3 =new ru.alexandrov.geometry.point.Point(3,3);
//
//        ru.alexandrov.geometry.line.Line l1 = new ru.alexandrov.geometry.line.Line(p1,p2);
//        ru.alexandrov.geometry.line.Line l2 = new ru.alexandrov.geometry.line.Line(p2, p3);
//
//        System.out.println(l1);
//        System.out.println(l2);
//
//        p3.y = -32;
//
//        l2.setEnd(l1.getStart());
//        l2.setEnd(new ru.alexandrov.geometry.point.Point(-7,-9));
//
//        System.out.println(l1);
//        System.out.println(l2);
//
//        //ru.alexandrov.humans.Name n1 = new ru.alexandrov.humans.Name("","","");
//
//        ru.alexandrov.humans.Human h1 = new ru.alexandrov.humans.Human("Саша",500,true);
//        System.out.println(h1);
//
//        ru.alexandrov.humans.Student s1= new ru.alexandrov.humans.Student("Илья",5,5,5,5);
//        System.out.println(s1);
//        s1.isExcellent();
//
//        City A = new City("A");
//        City B = new City("B");
//        City C = new City("C");
//        City D = new City("D");
//        City E = new City("E");
//        City F = new City("F");
//
//        A.addWay(new Way(F,1));
//        A.addWay(new Way(B,5));
//        A.addWay(new Way(D,6));
//        B.addWay(new Way(A,5));
//        B.addWay(new Way(C,3));
//        C.addWay(new Way(B,3));
//        C.addWay(new Way(D,4));
//        D.addWay(new Way(C,4));
//        D.addWay(new Way(A,6));
//        D.addWay(new Way(E,2));
//        E.addWay(new Way(F,2));
//        F.addWay(new Way(E,2));
//        Way way = new Way(B,1);
//        Way way2 = new Way(B,13);
//        F.addWay(way);
//        F.addWay(new Way(B,13));
//        System.out.println(A);
//        System.out.println(B);
//        System.out.println(C);
//        System.out.println(D);
//        System.out.println(E);
//        System.out.println(F);
//
//        System.out.println(way.equals(way2));
        Department dp = new Department("IT");
        Department dp2 = new Department("TI");
        Employee emp1 = new Employee(Name.Name("Илья"),dp);
        dp.setHead(emp1);
        System.out.println(emp1);
        System.out.println(dp2);
        System.out.println(dp);
        System.out.println();
        dp2.setHead(emp1);
        System.out.println(emp1);
        System.out.println(dp2);
        System.out.println(dp);
        System.out.println();
        emp1.dismiss();
        dp2.addEmployee(emp1);
        System.out.println(emp1);
        System.out.println();
        dp.addEmployee(emp1);
        System.out.println(emp1);
        System.out.println();
        emp1.setDepartment(dp2);
        System.out.println(emp1);
        System.out.println(dp2);
        System.out.println(dp);

//        ru.alexandrov.geometry.line.Polyline pl = new ru.alexandrov.geometry.line.Polyline(new ru.alexandrov.geometry.point.Point(0,0), new ru.alexandrov.geometry.point.Point(5,5));
//        System.out.println(pl.length());
//        ru.alexandrov.geometry.line.ClosedPolyline cpl = new ru.alexandrov.geometry.line.ClosedPolyline(pl.points);
//        System.out.println(cpl.length());
//
//        ru.alexandrov.city.TwoSidedCity A = new ru.alexandrov.city.TwoSidedCity("A");
//        ru.alexandrov.city.TwoSidedCity B = new ru.alexandrov.city.TwoSidedCity("B");
//        ru.alexandrov.city.TwoSidedCity C = new ru.alexandrov.city.TwoSidedCity("C");
//
//
//        A.addWay(new ru.alexandrov.city.Way(B,5));
//        A.addWay(new ru.alexandrov.city.Way(C,3));
//        System.out.println(A);
//        System.out.println(B);
//        System.out.println(C);
//        ru.alexandrov.city.TwoSidedCity D = new ru.alexandrov.city.TwoSidedCity("D",new ru.alexandrov.city.Way(B,2),new ru.alexandrov.city.Way(C,2));
//        A.deleteWay(B);
//        System.out.println(A);
//        System.out.println(B);
//        System.out.println(C);
//        System.out.println(D);

//        System.out.println(ru.alexandrov.numbers.Fraction.sum(1,4,new ru.alexandrov.numbers.Fraction(1,5),2.5));
//
//        ru.alexandrov.animals.birds.Bird.singAll(new ru.alexandrov.animals.birds.Cuckoo(),new ru.alexandrov.animals.birds.Sparrow(), new ru.alexandrov.animals.birds.Parrot("кар кар"));
//
//        List<ru.alexandrov.main.Lenthabel> l= new ArrayList<>();

        TwoSidedCity A1 = new  TwoSidedCity("A1");
        TwoSidedCity B1 = new TwoSidedCity("B1");
        TwoSidedCity C1 = new  TwoSidedCity("C1");
        Way a1b = new Way(B1,6);
        Way b1a = new Way(C1, 8);
        A1.addWay(a1b);
        System.out.println(A1);
        System.out.println(B1);
        B1.addWay(b1a);
        System.out.println(A1);
        System.out.println(B1);
        System.out.println(C1);

        System.out.println(sum(7,new Fraction(11/13),new BigInteger("12345678912345678912") ));


        //System.out.println(pow(args[0],args[1]));
        Parrot s= new Parrot("123 456 789");
        s.sing();
        Point p3 =  Point.Point(1,2);
        System.out.println(p3);
        System.out.println(ru.alexandrov.geometry.point.Point.Point(1,11));

        SuperPoint sp = new SuperPoint();
        sp.addProperty( new Property<ru.alexandrov.geometry.point.Point>( Point.Point(1,2)) );
        sp.addProperty(new Property<Time>(new Time(532)));
        sp.addProperty(new Property<Time>(new Time(46456456)));
        System.out.println(sp);

        TwoSidedCity A = new TwoSidedCity("A");
        TwoSidedCity B = new TwoSidedCity("B");
        TwoSidedCity C = new TwoSidedCity("C");
        TwoSidedCity D = new TwoSidedCity("D");
        City E = new City("E");
        A.addWay(new Way(B,1));
        A.addWay(new Way(C,2));
        B.addWay(new Way(D,5));
        B.addWay(new Way(C,3));
        D.addWay(new Way(E,7));
        E.addWay(new Way(C,9));
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        Integer i = Integer.valueOf(128);
        Integer k = 128;
        System.out.println(i==k);
        Box<Integer> b = new Box<>(i);
        System.out.println( b.getT() + 2 );
        Point p1 = Point.Point(1,2);
        Point p2 = Point.Point(3,4);
        ThreePoint p5 = ThreePoint.ThreePoint(1,2,3);
        ThreePoint p4 =  ThreePoint.ThreePoint(4,5,6);
        Line<ThreePoint> l =Line.Line(p4,p5);
        System.out.println(l);
        System.out.println();
        moveLine(l);
        System.out.println(l);
        Storage<Integer> n1 = Storage.Storage(4 );
        Storage< Integer> n2 = Storage.Storage(-3 );
        Storage< Integer> n3 = Storage.Storage(10);
        Storage< Integer> n4 = Storage.Storage(323 );
        System.out.println(maxVal(Integer.valueOf(3),n1,n2,n3,n4));
        Box<?> box = new Box();
        setVal(box);
        System.out.println(box.getT());
//        MyList<String> list= new MyList<>();
////        list.list.add("123");
////        list.list.add("4");
////        list.list.add("987");
////        list.list.add("9");
////        list.list.add("1234");
////        list.list.add("5");
//        list.list.add("321");
//        list.list.add("qqqqqqqqqqq");
//        list.list.add("1");
//
//        MyList<Integer> list2 = new MyList<>();
//        list2.list.add(1);
//        list2.list.add(-3);
//        list2.list.add(-7);
//
//        MyList<Integer[]> listArr = new MyList<>();
//        MyList<Integer[]> listArrRes;
//        Integer[] arr1 = {1,2,3};
//        Integer[] arr2 = {1,-2,3};
//        Integer[] arr3 = {-1,-2,-3};
//        listArr.list.add(arr1);
//        listArr.list.add(arr2);
//        listArr.list.add(arr3);
//        System.out.println(list.map(String::length));
//        System.out.println(list2.map(Math::abs) );
//        listArrRes = listArr.filter(integers -> {
//                for (Integer integer :integers) {
//                    if(integer> 0) return false;
//                }
//                return true;
//    }
//        );
//        for (Integer[] in:listArrRes.list) {
//            for (Integer integer: in) {
//                System.out.print(integer);
//            }
//            System.out.println();
//        }
//
//        System.out.println(list.reduce("",(x1, x2)->x1+x2));
//        System.out.println(list2.reduce(0, Integer::sum));
//        System.out.println(listArr.reduce(0,(x1,x2)->x1+x2.length));
//
//        System.out.println(list2.collect(   (x, x2)->x>x2,(lst, value, srt)->{
//            for (Integer ls : lst){
//                if(srt.sort(value,0) == srt.sort(ls,0)){
//                    lst.add(value);
//                    return true;
//                }
//            }
//            return false;
//        }));
//        System.out.println(list.collect(   (x1, x2)->x1.length() == x2.length(),(lst, value, srt)->{
//            for (String ls : lst){
//                if(srt.sort(value,ls) ){
//                    lst.add(value);
//                    return true;
//                }
//            }
//            return false;
//        }));
//        System.out.println(list.collect(   (x1, x2)-> {
//            for (int i1 = 0;i1<x1.length();i1++) {
//                if(x2.contains(""+x1.charAt(i1)))
//                    return false;
//            }
//            return true;
//        },(lst,value,srt)->{
//            for (String ls : lst){
//                if(!srt.sort(value,ls) )
//                    return false;
//            }
//            lst.add(value);
//            return true;
//        }));

//        System.out.println(list.filter( x-> x.length() > 5 ).map(x->x.length()).reduce(0,(x,y)->x+y));
        DataBase db = new DataBase(15);
        Connectable cn1 = db.connect();
        Connectable cn2 = db.connect();
        cn1.addLine("cn1");
        cn2.addLine("cn2");
        System.out.printf(cn1.getLine(1));
        Student<Integer> vasy = new Student<>((x-> x%2 == 0),"vs",2,4,8);

        Point pp2 = Point.Point(1,2);
        Point pp3;
        pp3 = (Point) pp2.clone();
        System.out.println( pp3.equals(pp2) + "");

        List<String> lst1 = new ArrayList<>(List.of("11","2222","3","22","321","42434543"));
        MyStream<String> ml = new MyStream(lst1);
//        System.out.println(ml.map(String::length).filter(x->x>1).collect(new HashSet<>(), (x, y) -> {
//                    if (y == null)
//                        y = new HashSet();
//                    y.add(x);
//                    return y;
//                }
//        ));

        System.out.println(
                new MyStream<>(List.of("-5","7","-3","32"))
//                        .filter(x->x.length()<2)
                        .map(Integer::parseInt)
                        .map(Math::abs)
                        .filter(x -> x >= 5)
                        .map(x->x+"")
//                        .collect(new ArrayList<>(),(x,y)->{
//                            if (y== null)
//                                y = new ArrayList<>();
//                            if(x != null)
//                                y.add(x);
//                            return  y;
//                        })
                        .reduce("",(x,y)->x+y)
        );

            Student<Integer> integerStudent = new Student<>(x -> x>=2 || x<= 5,"fdf");
            Student<Integer> integerStudent2 = new Student<>(x -> x>=2 || x<= 5,"fdf");
            integerStudent.addEvaluation(4);
            integerStudent.addEvaluation(5);
            integerStudent.addEvaluation(3);
        System.out.println(integerStudent);
        integerStudent.setEvaluations(List.of(3,4,3));
        System.out.println(integerStudent);
        integerStudent.undo();
        System.out.println(integerStudent);
        Meowable m = new Cat("Cat",()-> System.out.println("Мяу мяу мяу"));

        KarateBoy kb = new KarateBoy("Vasya");
        Combo combo = new Combo();
        combo.hits.add(KarateBoy::foot);
        combo.hits.add(KarateBoy::hand);
        combo.hits.add(KarateBoy::foot);
        combo.hits.add(KarateBoy::jump);
    }



    public static void setVal(Box b){
        b.setT(Point.Point(1,2,3));
    }

    public static void moveLine(Line<? extends Point> line){
        line.getStart().x += 10;
        line.getEnd().x -= 10;
    }

    public static int lenSum(Lengthabel ... len){
        return Stream.of(len)
                .map(Lengthabel::length)
                .reduce(0,Integer::sum);
    }

    public  static  <P extends Number > double maxVal(P def,Storage<P> ... numbs){
        return Stream.of(numbs)
                .map(x->x.orElse(def).doubleValue())
                .max(Double::compare)
                .orElseThrow(IllegalArgumentException::new);
    }

    public static void meow(Meowable ... m){
        for (Meowable meow:m)
            meow.meow();
    }

    public static void move(int shift,String[] names,Moveable ... mv ){
        for (Moveable m:mv)
            m.move(shift,names);
    }


    public static int pow(String x,String y){
        return (int)Math.pow(Integer.parseInt(x),Integer.parseInt(y));
    }
}
