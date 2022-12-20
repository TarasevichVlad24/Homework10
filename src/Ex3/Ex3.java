package Ex3;

public class Ex3 {
    public static void printMinimumDifferentCharacters(String string){
        String[] arr = string.split(" ");
        int min = 99;
        int counter = 0;
        int resIndex = 0;
        for(String word: arr){
            StringBuilder wordStringBuilder = new StringBuilder(word);
            for(int i = 0; i<wordStringBuilder.length();i++){
                char ch = word.charAt(i);
                if (word.indexOf(ch,i+1)>-1){
                    wordStringBuilder.deleteCharAt(i);
                    word = wordStringBuilder.toString();
                    i--;
                }
            }
            if(word.length()<min){
                min = word.length();
                resIndex = counter;
            }
            counter++;
        }
        System.out.println(arr[resIndex]);
    }
}
