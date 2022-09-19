import java.util.ArrayList;

public class Ex03 {
    public static void printArray(ArrayList<String> myArray){
        for (String str: myArray){
            System.out.println(str);
        }
    }
    public static void main(String[] args){
        ArrayList<String> array1 = new ArrayList<String>();
        array1.add("a");
        array1.add("b");
        array1.add("c");
        printArray(array1);
    }
}