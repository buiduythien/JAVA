package ua.khpi.oop.lab3;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelperClass {
    public void outputText(StringBuilder line)
    {

        System.out.println(line);
    }


    public StringBuilder inputText()
    {StringBuilder StringBuilder=new StringBuilder();
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter text: ");

        String inputText = Scanner.nextLine();
        Scanner.close();
        int temp = 0;

        for(int i =0 ;i<inputText.length();i++) {
            StringBuilder.append(inputText.charAt(i));
        }

        return StringBuilder;
    }
    public  void getWords(String text,int k, String sentence) {
        List<String> words = new ArrayList<String>();
        BreakIterator breakIterator = BreakIterator.getWordInstance();
        breakIterator.setText(text);
        int lastIndex = breakIterator.first();
        while (BreakIterator.DONE != lastIndex) {
            int firstIndex = lastIndex;
            lastIndex = breakIterator.next();
            if (lastIndex != BreakIterator.DONE && Character.isLetterOrDigit(text.charAt(firstIndex))) {
                words.add(text.substring(firstIndex, lastIndex));
            }
        }
        for(int i=0; i< words.size();i++){
            if(words.get(i).length() == k){
                words.set(i,sentence);

            }
            System.out.print(words.get(i)+" ");
        }
    }

    public static void main(String[] args) {
        int k = 4;
        String sen = ". ДУБ ЗЕЛЕНИЙ ,";






        HelperClass help = new HelperClass();
        StringBuilder text =help.inputText();
        String str = text.toString();
        help.outputText(text);

        help.getWords(str,k,sen);





    }
}

