public class Gecko{

    private String name = "Unknown";

    public Gecko(String gecko_name){
        this.name = gecko_name;
        System.out.println("Hello " + name + "!");
    }
    public Gecko(){
        System.out.println("Hello!");
    }
    public String getName(){
        return name;
    }
 }