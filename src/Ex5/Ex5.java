package Ex5;

public class Ex5 {

public static void printDoubleLetter(String string){
    String[] splitted = string.split("");
    for (String character:splitted){
        System.out.print(character.repeat(2));
    }
}

}