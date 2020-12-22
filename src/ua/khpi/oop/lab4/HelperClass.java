package ua.khpi.oop.lab4;

import java.util.Scanner;

public class HelperClass {
    public void OutputProcessedText(StringBuilder line)
    {
        System.out.println(line);
    }

    public String inputText()
    {
        Scanner scan = new Scanner(System.in);

        String inputText = scan.nextLine();

        return inputText;
    }

    public void HelpInfo()
    {
        System.out.println("Aвтор : Буй Зуі КІТ-119а.");
        System.out.println("Ввести текст : У тексті слова заданої довжини замінити зазначеним рядком. Вивести початковий текст та результат.");
         System.out.println("Menu");
            System.out.println("1. Enter text :     = необходимо ввести текст =");
            System.out.println("2. Execute the task with output result:      = выполнение  задание с исходным текстом =");
            System.out.println("3. Exit = окончание программы  =");
    }
}
