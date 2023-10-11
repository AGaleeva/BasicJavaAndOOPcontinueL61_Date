package homework61;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person implements Comparable<Person> {
    private String name;
    private Date dob;

    public Person(String name, String dob) throws ParseException {
        this.name = name;
        this.dob = toDate(dob);
    }

    private Date toDate(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Date dob = sdf.parse(str);
        return dob;
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
