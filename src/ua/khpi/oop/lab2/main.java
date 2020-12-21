package ua.khpi.oop.lab2;

public class main {
    public static void main(String args[]) {
        int binz1 =  0x1E697;
        long binz2 = 4247108 + (38063 * (long) Math.pow(10,7));
        int binz3 = 0b11111;
        int binz4 = 04577;
        int binz5 = 1 + ((26 - 1) % 26);
        char c = (char) binz5;
        long temp;
        char one = '1';
        long bin = 0;
        String str;
        int odd = 0;
        int even = 0;
        temp = binz1;
        while (temp > 0) {
            if (temp % 2 == 0) {
                even += 1;
            }
            else {
                odd += 1;
            }
            temp /= 10;
        }
        str = Integer.toBinaryString(binz1);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == one) {
                bin += 1;
            }
        }
        System.out.println("Первое число - " + binz1 + " количество чётных: " + even + " и нечётных цифр: " + odd + " количество единиц в двоичном представлении: " + bin + "\n");
        odd = 0;
        even = 0;
        bin = 0;
        temp = binz2;
        while (temp > 0) {
            if (temp % 2 == 0) {
                even += 1;
            }
            else {
                odd += 1;
            }
            temp /= 10;
        }
        str = Long.toBinaryString(binz2);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == one) {
                bin += 1;
            }
        }
        System.out.println("Второе число - " + binz2 + " количество чётных: " + even + " и нечётных цифр: " + odd + " количество единиц в двоичном представлении: " + bin + "\n");
        odd = 0;
        even = 0;
        bin = 0;
        temp = binz3;
        while (temp > 0) {
            if (temp % 2 == 0) {
                even += 1;
            }
            else {
                odd += 1;
            }
            temp /= 10;
        }
        str = Integer.toBinaryString(binz3);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == one) {
                bin += 1;
            }
        }
        System.out.println("Третье число - " + binz3 + " количество чётных: " + even + " и нечётных цифр: " + odd + " количество единиц в двоичном представлении: " + bin + "\n");
        odd = 0;
        even = 0;
        bin = 0;
        temp = binz4;
        while (temp > 0) {
            if (temp % 2 == 0) {
                even += 1;
            }
            else {
                odd += 1;
            }
            temp /= 10;
        }
        str = Integer.toBinaryString(binz4);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == one) {
                bin += 1;
            }
        }
        System.out.println("Четвертое число - " + binz4 + " количество чётных: " + even + " и нечётных цифр: " + odd + " количество единиц в двоичном представлении: " + bin + "\n");
        odd = 0;
        even = 0;
        bin = 0;
        temp = binz5;
        while (temp > 0) {
            if (temp % 2 == 0) {
                even += 1;
            }
            else {
                odd += 1;
            }
            temp /= 10;
        }
        str = Integer.toBinaryString(binz5);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == one) {
                bin += 1;
            }
        }
        System.out.println("Пятое число - " + binz5 + " количество чётных: " + even + " и нечётных цифр: " + odd + " количество единиц в двоичном представлении: " + bin + "\n");
        System.out.println("Символ полученный из пятого числа: " + c + "\n");
    }
}
