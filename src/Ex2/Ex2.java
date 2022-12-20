package Ex2;

public class Ex2 {
    public static void printShortestWord(String string){
        String[] arr = string.split(" ");
        int min = 99;
        String shortestWord = "";
        for(String str: arr){
            if(str.length()<=min){
                min=str.length();
                shortestWord = str;
            }
        }
        System.out.println(shortestWord);
    }
    public static void printLongestWord(String string){
        String[] arr = string.split(" ");
        int max = 0;
        String longestWord = "";
        for(String str: arr){
            if(str.length()>=max){
                max = str.length();
                longestWord = str;
            }
        }
        System.out.println(longestWord);
    }
}
