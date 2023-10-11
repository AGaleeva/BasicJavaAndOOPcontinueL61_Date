package homework61;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    /*
    Создайте класс Person, c полями имя(стринг) и дата рождения(Date), которому при создании передавайте имя
    и дату рождения в виде строки в формате "ДД.ММ.ГГГГ".

    Реализуйте в классе интерфейс Comparable<Person>, в котором "меньше" будет значить "младше".

    Подсказка: не обязательно вычислять возраст, этому мы так и не научились. Но можно сравнивать даты рождения!
    */

    /*
    SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
    Date octoberfest = formatter.parse("16.09.2023");
    */
    public static void main(String[] args)  throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        List<Person> personList = new ArrayList<>(List.of(
                new Person("John Derek", sdf.parse("16.07.1987")),
                new Person("Emmanuel Simpson", sdf.parse("11.04.1990")),
                new Person("Ann Smith", sdf.parse("03.01.1993")),
                new Person("George Wilson", sdf.parse("21.08.1983"))
        ));

        personList.sort(Person::compareTo);
        System.out.println(personList);
    }
}
