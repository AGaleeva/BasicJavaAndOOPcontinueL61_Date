package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FormatterDemo {
    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar();
        Date current = calendar.getTime();
        System.out.println(current);

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy. dd. MM");
        String currentAsString = formatter.format(current);
        System.out.println(currentAsString);

//        Создайте и выведите следующее значение "2018-12 13" Год месяц день
        Calendar modifiedCalendar = new GregorianCalendar(2018, Calendar.DECEMBER, 13);
        Date getDate = modifiedCalendar.getTime();
        SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM dd");
        String getFormDate = formatter1.format(getDate);
        System.out.println(getFormDate);

//        изменить дату "умным" способом

        modifiedCalendar.add(Calendar.DATE, 20);
        System.out.println(modifiedCalendar.getTime());

        modifiedCalendar.add(Calendar.DATE, -20);
        System.out.println(modifiedCalendar.getTime());

    }
}
