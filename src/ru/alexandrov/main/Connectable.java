package ru.alexandrov.main;

public interface Connectable {
    public String getLine(int index);


    public void addLine(String line);
    public void close();
    public boolean isClosed();
}
