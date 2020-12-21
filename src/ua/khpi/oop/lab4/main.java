package ua.khpi.oop.lab4;


import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.StringBuilder;

import java.util.*;

public class main {
    public static int k = 4;
    public static String sentence = " ДУБ ЗЕЛЕНИЙ " ;
    public static HelperClass help = new HelperClass();
    public static boolean debugFlag = false;
    public static StringBuilder text = new StringBuilder();
    public static String newtext = new String();
    public static StringBuilder insertedText = new StringBuilder();


    public static void main(String[] args) {

        for(String bbc: args)
        {
            if(bbc.equals("-h") || bbc.equals("-help")) help.HelpInfo();
            if(bbc.equals("-d") || bbc.equals("-debug")) debugFlag = true;
        }

        main.menu();

    }

    static void menu()
    {
        Scanner scan = new Scanner(System.in);
        String choise;
        boolean stop = false;

        while(stop != true)
        {
            System.out.println("What to do?");
            System.out.println("1. Enter the data");
            System.out.println("2. Perfom a task");
            System.out.println("3. End program");
            System.out.println("=================");
            System.out.print("Your choise: ");

            choise = scan.nextLine();

            switch(choise) {
                case "1":

                    System.out.print("Enter processed text: ");
                    text = new StringBuilder(help.inputText());

                    System.out.println(" ");
                    break;

                case "2":


                    if (text.toString().isEmpty() )
                        System.out.println("Error. Enter the data before.\n");

                    else
                        newtext = text.toString();
                    getWords( newtext, k,  sentence);

                    break;

                case "3":
                    stop = true;
                    break;

                default:
                    System.out.println("Error. Wrong command.\n");
                    break;
            }
        }

        scan.close();
    }

    static void getWords(String text,int k, String sentence) {
        if(debugFlag)
        {
            System.out.print("Text : " + text + "\n\n");
            System.out.println("Length of processed text: " + text.length());
            System.out.print("\n\n");

        }

        List<String> words = new ArrayList<String>();
        BreakIterator breakIterator = BreakIterator.getWordInstance();
        breakIterator.setText(text);
        int lastIndex = breakIterator.first();
        while (BreakIterator.DONE != lastIndex) {

            int firstIndex = lastIndex;
            lastIndex = breakIterator.next();
            if (lastIndex != BreakIterator.DONE && Character.isLetterOrDigit(text.charAt(firstIndex))) {
                words.add(text.substring(firstIndex, lastIndex));
                if(debugFlag){
                    System.out.println("Text in progress:  "+ words);}
            }

        }
        for(int i=0; i< words.size();i++){

            if(words.get(i).length() == k){
                if(debugFlag) System.out.println("Swap.");
                words.set(i,sentence);


            }

            System.out.print(words.get(i)+" ");


        }
        System.out.println(" ");
        if(debugFlag) System.out.println("No more matches to insert text.");
    }


}

