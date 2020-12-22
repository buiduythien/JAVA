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
        System.out.println("\nMENU:\n1) Input text            --- allows you to enter text");
        System.out.println("2) Task                  --- performs the task with your text, that you input in 1 action");
        System.out.println("3) Show input text       --- output your text, that you input in 1 action");
        System.out.println("4) Show result           --- shows the result of the task");
        System.out.println("5) Exit program          --- ends the program");
    }

    public void outputText(StringBuilder text) {
    }
}
