package Ex1;

public class Ex1 {
    public static void printTwoBlocks(String docNum){
        String[] arr = docNum.split("-");
        System.out.println(arr[0] + "//" + arr[2]);
    }
    public static void replaceBlocks(String docNum){
        String replace = docNum.replace("a","*")
                .replace("b","*");
        System.out.println(replace);
    }
    //public static void replaceBlocks1(String docNum){
     //   String[] arr = docNum.split("-");
      //  String replace = docNum.replace(arr[1],"***").replace(arr[3],"***");
     //   System.out.println(replace);
    //}

    public static void printLetters(String docNum){
        String[] arr = docNum.split("-");
        String string = arr[1] +"/" + arr[3] + "/" + arr[4].charAt(0) + "/" + arr[4].charAt(2);
        System.out.println(string);
    }
    public static void stringBuilder(String docNum){
        StringBuilder sb = new StringBuilder(docNum);
        sb.replace(0,5,"/")
                .replace(4,10,"/")
                .replace(8,9,"/")
                .replace(10,11,"/")
                .deleteCharAt(12);
        System.out.println("Letters:" + sb);
    }
    public static void printContainsAbc(String docNum){
        System.out.println(docNum.toLowerCase().contains("abc") || docNum.toUpperCase().contains("ABC"));
    }
    public static void startsWith(String docNum){
        System.out.println(docNum.startsWith("555"));
    }
    public static void endsWith(String docNum){
        System.out.println(docNum.endsWith("1a2b"));
    }




    }

