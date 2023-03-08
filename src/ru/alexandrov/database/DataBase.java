package ru.alexandrov.database;

import ru.alexandrov.main.Connectable;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private int N;
    final int maxConnect;
    private List<String> lines = new ArrayList<>();

    public DataBase(int maxConnect) {
        this.maxConnect = maxConnect;
    }

    {
        lines.add("1");
        lines.add("2");
        lines.add("3");
        lines.add("4");
        lines.add("5");
        lines.add("6");
        lines.add("7");
        lines.add("8");
        lines.add("9");
        lines.add("10");
    }
    public Connection connect(){

        //если открытх конекшнов равно макс то налл
        //иначе возврашаем новый конекшн
        if(N == maxConnect)  return null;
        N++;
        return new Connection();
    }

    private class Connection implements Connectable {
        private boolean isClosed=false;


        private Connection() {
        }

        public String getLine(int index) {
            if(isClosed()) throw new IllegalArgumentException("Connection is closed.");
            if(index >= lines.size() || index < 0) return null;
            return lines.get(index);
        }


        public void addLine(String line){
            if(isClosed()) throw new IllegalArgumentException("Connection is closed.");
            lines.add(line);
        }
        public void close(){
//            N--;                        // А надо ли?
            isClosed=true;}
        public boolean isClosed(){return isClosed;}
    }
}
