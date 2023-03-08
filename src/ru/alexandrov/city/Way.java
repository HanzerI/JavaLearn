package ru.alexandrov.city;

public class Way {
    private City city;
    private int price;


    public Way(City city, int price) {
        if(price < 0 ) throw new IllegalArgumentException("Цена должна быть больше 0");
        this.price = price;
        this.city = city;
    }

        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Way)) return false;
        Way way = (Way) o;
        return (this.city == way.city);
    }

    @Override
    public int hashCode() {
        return city.hashCode();
    }

    public void setPrice(int price) {
        if(price < 0 ) throw new IllegalArgumentException("Цена должна быть больше 0");
        this.price = price;
    }

    public City getCity() {
        return city;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return " в город " +  city.name +
                " равен " + price;
    }
}
