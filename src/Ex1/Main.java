package Ex1;

public class Main {
    public static void main(String[] args){
        String docNum = "1111-aaa-2222-bbb-c3c3";
        Ex1.printTwoBlocks(docNum);
        Ex1.replaceBlocks(docNum);
        Ex1.printLetters(docNum);
        StringBuilder sb = new StringBuilder(docNum);
        sb.replace(0,5,"/")
                .replace(4,10,"/")
                .replace(8,9,"/")
                .replace(10,11,"/")
                .charAt(12);
        System.out.println("Letters:" + sb);
        Ex1.printContainsAbc(docNum);
        Ex1.startsWith(docNum);
        Ex1.endsWith(docNum);

    }


}
