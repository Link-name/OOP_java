package Sem_Lesson_2.lesson2.intro;

import Sem_Lesson_2.lesson2.abs.DefaultStringDateConverter;
import Sem_Lesson_2.lesson2.abs.IsoStringDateConverter;
import Sem_Lesson_2.lesson2.intrfc.DateConverter;
import Sem_Lesson_2.lesson2.intrfc.DateTimeConverter;
import Sem_Lesson_2.lesson2.intrfc.DefaultDateConverter;
import Sem_Lesson_2.lesson2.intrfc.IsoDateConverter;

import java.time.LocalDate;

public class Lesson2Main {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(new DefaultStringDateConverter(now).dateAsString());
        System.out.println(new IsoStringDateConverter(now).dateAsString());

        DateConverter dateConverter = new DefaultDateConverter();
        DateTimeConverter dateTimeConverter = new DefaultDateConverter();

        System.out.println(dateConverter.convert(now));
        System.out.println(new IsoDateConverter().convert(now));
    }

}
