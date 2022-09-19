public class Example {
    public static void main(String[] args){
        Gecko mimi = new Gecko("mimi");
        Gecko mama = new Gecko("mama");
        Snake solid = new Snake();

        mama.fraternize(mimi);
        mama.fraternize(mimi);
        mama.fraternize(solid);
        mama.fraternize(mimi);
        mama.fraternize(mimi);
        mama.fraternize(solid);
        
    }
}
