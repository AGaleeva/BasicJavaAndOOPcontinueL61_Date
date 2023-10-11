package homework61;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person implements Comparable<Person> {
    private String name;
    private Date dob;

    public Person(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        return "Person{" + "name='" + name + '\'' + ", dob=" + formatter.format(dob) + '}';
    }
    @Override
    public int compareTo(Person o) {
        return this.dob.compareTo(o.dob);
    }
}
