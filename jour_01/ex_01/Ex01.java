public class Ex01 {
    public static void myConcat(String str1, String str2){
        String completeString = str1 + " " + str2;
        System.out.print(completeString);
    }
    public static void main(String[] args){
        myConcat("Hello", "World");
    }
}