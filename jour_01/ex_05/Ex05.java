import java.util.ArrayList;

public class Ex05 {
    public static ArrayList<String> myGetArgs(String... var){

        ArrayList<String> array1 = new ArrayList<String>();

        for (String str: var){
            array1.add(str);
        };
        return array1;
    }
    public static void main(String[] args){

        System.out.println(myGetArgs("a","b","c","d"));
    }
}