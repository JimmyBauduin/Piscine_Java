public class Ex02 {
    public static String getAngryDog(int nbr){
        String woofnb = "";
        for (int i = 0; i< nbr; i++){
            woofnb = woofnb + "woof";
        }
        return woofnb;
    }
    public static void main(String[] args){
        System.out.println(getAngryDog(5));
    }
}
