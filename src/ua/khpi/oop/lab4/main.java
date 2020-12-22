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

    static void menu() {
        Scanner scan = new Scanner(System.in);
        String choise;
        

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Enter text :");
            System.out.println("2. Execute the task with output result:");
            System.out.println("3. Exit");
            System.out.println("------------");
            System.out.print("Your choise: ");

            choise = scan.nextLine();
            System.out.println(choise);

            if (Integer.parseInt(choise) == 1) {

                System.out.print("Please enter  text: ");
                text = new StringBuilder(help.inputText());

                System.out.println(" ");

            } else if (Integer.parseInt(choise) == 2) {


                if (text.toString().isEmpty())
                    System.out.println("There is no data.Please enter your data text !\n");


                else
                    newtext = text.toString();
                getWords(newtext, k, sentence);


            } else if (Integer.parseInt(choise) == 3) {

                break;
            } else {
                System.out.println("Unknown command!\n");

            }

        }
            scan.close();

    }

    static void getWords(String text,int k, String sentence) {
        if(debugFlag)
        {
            System.out.print("Text : " + text + "\n\n");
            System.out.println("Length of  text: " + text.length());
            System.out.println("Your text is processing in debag mode");
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



