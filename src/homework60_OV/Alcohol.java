package homework60_OV;

import java.util.Objects;

public class Alcohol implements Comparable<Alcohol> {
    private String title;
    private double strength;
    private double price;

    public Alcohol(String title, double strength, double price) {
        this.title = title;
        this.strength = strength;
        this.price = price;
    }

    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alcohol alcohol = (Alcohol) o;
        return Double.compare(alcohol.strength, strength) == 0 && Double.compare(alcohol.price, price) == 0 && Objects.equals(title, alcohol.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, strength, price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Alcohol{" + "title='" + title + '\'' + ", strength=" + strength + ", price=" + price + '}';
    }

    @Override
    public int compareTo(Alcohol o) {
        return Double.compare(this.price, o.price);
    }
}

