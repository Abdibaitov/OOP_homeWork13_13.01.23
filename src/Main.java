import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Classs classs = new Classs(18,"Kyrgyzstan",new int[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println("number: "+classs.getNumber()+"\nString: "+classs.getWord()+"\narray: "+ Arrays.toString(classs.getArray()));
    }
}