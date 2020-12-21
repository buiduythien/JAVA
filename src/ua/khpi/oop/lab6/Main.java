package ua.khpi.oop.lab6;
import java.util.Scanner;
import ua.khpi.oop.lab3.HelperClass;
public class Main {
    public static void main(String[] args) {
        HelperClass help = new HelperClass();
        Container cont = new Container("hello","how how","are you");
        Scanner in = new Scanner(System.in);
        int ch = 0;
        Serialization ser = new Serialization();

        while(ch != 11)
        {
            System.out.println("----------------------");
            System.out.println("1) Сериализация данных;");
            System.out.println("2)  данные десериализации;");
            System.out.println("3)  Показать контейнер;");
            System.out.println("4)  Добавить новый элемент;");
            System.out.println("5)  Удалить элемент;");
            System.out.println("6)  Найти элемент;");
            System.out.println("7)   Сравните;");
            System.out.println("8)  Задача помощников;");
            System.out.println("9)  Моя задача;");
            System.out.println("10) Сортировать;");
            System.out.println("11) Выход;");
            System.out.print("----------------------\nYour choice: ");
            ch = in.nextInt();

            switch(ch)
            {
                case 1:
                    System.out.println("Serialization: " + ser.serialization(cont));
                    break;
                case 2:
                    cont = ser.deserialization();
                    break;
                case 3:
                    System.out.println("Данные в строку: " + cont.toString());
                    break;
                case 4:
                    System.out.println("Добавить новую строку 'end'");
                    cont.add("end");
                    break;
                case 5:
                    System.out.println("Удалить строку 'how'");
                    cont.remove("how");
                    break;
                case 6:
                    System.out.println("Содержит ли продолжение 'как':" + cont.contains("how"));
                    break;
                case 7:
                    System.out.println("Все ли во втором продолжении:" + cont.containsAll(new Container("hello","how","are you","end")));
                    break;
                case 8:
                    help.getWords(cont.GetEl(1),3," ДУБ ЗЕЛЕНИЙ ");

                    break;
                case 9:
                    StringBuilder ts = new StringBuilder(cont.GetEl(1));
                    String str = ts.toString();
                    help.getWords(str,3," ДУБ ЗЕЛЕНИЙ ");
                    break;
                case 10:
                    cont.Sort();
                    break;
                default:
                    break;
            }
        }

        in.close();
        cont.clear();
        System.out.println("Bye!!!");
    }

}
