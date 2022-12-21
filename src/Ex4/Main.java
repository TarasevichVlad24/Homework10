package Ex4;

import java.util.Scanner;

public class Main {
public static void main(String[]args){
    String string = "cat frog madam computer mouse";
    Ex4 stringObject = new Ex4(string);
    Scanner s = new Scanner(System.in);
    System.out.println(string);
    System.out.println("Выберите слово");
    int wordNum = s.nextInt();

    while(!stringObject.hasWord(wordNum)){
        System.out.println("Повторите попытку");
        wordNum = s.nextInt();
    }
    if(stringObject.palindrome(wordNum)){
        System.out.println("Палиндром");
    } else {
        System.out.println("не палиндром");
    }
}
}
