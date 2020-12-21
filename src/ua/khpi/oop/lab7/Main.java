package ua.khpi.oop.lab7;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String[] listOfPeople1 = {"Äìèòðèé Èâàíîâ", "Àëåêñàíäð Ãåêòîðîâ", "Èâàí Ðîìàíîâ"};
        String[] listOfPeople2 = {"Ìàõàòìà Ãàíäè", "Èèñàê Íüþòîí", "Äæîðäæ Áóø Ìëàäøèé"};

        GregorianCalendar date1 = new GregorianCalendar(2017, 5, 28);
        date1.set(Calendar.HOUR_OF_DAY, 18);
        date1.set(Calendar.MINUTE, 0);
        date1.set(Calendar.SECOND, 10);
        Event event1 = new Event(date1,180,"Ïðîñïåêò Ëüâà Ëàíäàó 87",listOfPeople1, "Halloween");

        date1 = new GregorianCalendar(2002, 1, 1);
        date1.set(Calendar.HOUR_OF_DAY, 9);
        date1.set(Calendar.MINUTE, 30);
        date1.set(Calendar.SECOND, 00);
        Event event2 = new Event(date1,45,"Ïëîùàäü Êîíñòèòóöèè",listOfPeople2, "A lot of drunk people");

        EventList array = new EventList();
        array.array[0] = new Event(date1,180,"Ïðîñïåêò Ëüâà Ëàíäàó 87",listOfPeople1, "Halloween");
        array.array[1] = new Event(date1,45,"Ïëîùàäü Êîíñòèòóöèè",listOfPeople2, "A lot of drunk people");

        for (Event event : array.array) {
            event.outputData();
            System.out.println();
        }
    }

}
