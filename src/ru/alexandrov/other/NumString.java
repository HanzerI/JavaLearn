package ru.alexandrov.other;

import ru.alexandrov.main.Lengthabel;

public class NumString extends Number implements Lengthabel {

    private String str;

    public NumString(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public NumString() {
        super();
    }

    @Override
    public byte byteValue() {
        return (byte) str.length();
    }

    @Override
    public short shortValue() {
        return (short) str.length();
    }

    @Override
    public int intValue() {
        return str.length();
    }

    @Override
    public long longValue() {
        return str.length();
    }

    @Override
    public float floatValue() {
        return str.length();
    }

    @Override
    public double doubleValue() {
        return str.length();
    }

    @Override
    public int length() {
        return str.length();
    }
}
