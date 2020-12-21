package ua.khpi.oop.lab5;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        MyContainer ar = new MyContainer("Мы вольные птийы пора брат.", "Туда где за тучей белеет гора.");
        Iterator<String> iter = ar.getIterator();
        String line;

        System.out.println("Вывод массива с помощью цикла  while():");
        while(iter.hasNext())
        {
            line = iter.next();
            System.out.println(line);
        }

        System.out.println("\nДобавляем новый елемент : ");
        ar.add("дуб зеленый.");
        System.out.println("\nВывод массива с помощью цикла for() : ");
        iter = ar.getIterator();
        for(int i = 1;iter.hasNext();i++)
        {
            line = iter.next();
            System.out.println(i + ". " + line);
        }

        System.out.print("\nНаходим предложение \"Мы вольные птийы пора брат.\": " + ar.contains("Мы вольные птийы пора брат."));

        System.out.println("\n\nМассив имеет все предложение другого массива " + ar.containsAll(new MyContainer("привет", "Мы вольные птийы пора брат.", "Туда где за тучей белеет гора.", "дуб зеленый.", "пока")));

        System.out.println("\nДлина массива : " + ar.size() + "\nУдалаем одну елемент");
        ar.remove("дуб зеленый.");
        System.out.println("Длина массива : " + ar.size() + "\n");

        System.out.println("Завершенние работы");
        ar.clear();
    }
}
