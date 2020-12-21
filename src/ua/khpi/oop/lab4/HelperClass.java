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
        System.out.println("Пунктів меню : Enter the data, Perfom a task, End program.");
        System.out.println("Параметрів командного рядка : getWords.");
        System.out.println();
    }

    public void outputText(StringBuilder text) {
    }
}
