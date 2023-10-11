package date;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateDemo {
    public static void main(String[] args) throws IOException {
        Date date = new Date();
        System.out.println(date.getTime());
        System.out.println(date);

        // 1697016191164 Unox Timestamp - количество миллисекунд с 1 января 1970 г.

        System.out.println("Секунды: " + date.getTime() / 1000);
        System.out.println("Минуты: " + date.getTime() / 1000 / 60);
        System.out.println("Часы: " + date.getTime() / 1000 / 60 / 60);
        System.out.println("Дни: " + date.getTime() / 1000 / 60 / 60 / 24);
        System.out.println("Года: " + date.getTime() / 1000 / 60 / 60 / 24 / 365);


        // 1997 class Calendar - для работы с классом Date, в нем есть более адекватные методы

        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar);
        Date current = calendar.getTime(); // получить дату
        System.out.println(current);
        calendar.set(Calendar.DATE, 15); // поменяем число на 15-е
//        calendar.set(Calendar.YEAR, 2020); // поменяем год на 2020-й
//        calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
        System.out.println(calendar.getTime()); // получаем дату после изменения

        int currentYear = calendar.get(Calendar.YEAR);
        System.out.println(currentYear);

        Calendar calendar1 = new GregorianCalendar(2022, Calendar.JANUARY, 28);

        Calendar calendar2 = new GregorianCalendar();
        calendar2.roll(Calendar.DATE, -10); // изменяет число на переданное значение, но только внутри одного месяца
        System.out.println(calendar2.getTime());

//        Как вас зовут? Год рождения? Тогда вам 45.
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            System.out.println("Привет! Как тебя зовут?");
            String name = br.readLine();
            System.out.println("Приятно познакомиться, " + name + " Какой у тебя год рождения? ");
            int yearOfBirth = Integer.parseInt(br.readLine());
            int age = calendar.get(Calendar.YEAR) - yearOfBirth;
            System.out.println("Значит, тебе " + age + ", либо " + (age - 1));
        }


    }
}
