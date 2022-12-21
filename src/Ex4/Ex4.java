package Ex4;

public class Ex4 {
     private String str;
     private String[] words;
     private int count;


    public Ex4(String str){
        this.str = str;
        this.words = str.split(" ");
        this.count = words.length;
    }

    public boolean palindrome(int position){
        char[] charArr = words[position-1].toCharArray();
        for(int i=0,j=charArr.length-1;i<=j;i++,j--){
            if(charArr[i] != charArr[j]){
                return false;
            }
        }
        return true;
    }
    public boolean hasWord(int position){
        return position-1<count && position>0;
    }
}
