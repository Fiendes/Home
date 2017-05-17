package Practice;

import java.util.Scanner;
import java.lang.String;

public class sortBubble {

    public static void main(String[] args) {

        System.out.println("Введите данные");
        Scanner in = new Scanner(System.in);
        String row = in.nextLine();
        String[] words = row.split(" ");
        sort(words);
        print(words);
    }

    public static void print(String[] words) {

        for (String w : words) {
            System.out.println(w);

        }

    }

    public static void sort(String[] words) {
        String ch;

        for (int j = 1; j < words.length; j++) {
            for (int i = words.length -1 ; i >= j; i--){
                int val = words[i-1].compareTo(words[i]);
                if (val > 0) {
                    ch = words[i-1];
                    words[i-1] = words[i];
                    words[i] = ch;
                }
            }
        }
    }
}
