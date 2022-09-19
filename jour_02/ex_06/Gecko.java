public class Gecko{

    private String name = "Unknown";
    private int age;
    public int energy = 100;

    public Gecko(){
        System.out.println("Hello!");
    }
    public Gecko(String gecko_name){
        this.name = gecko_name;
        System.out.println("Hello " + name + "!");
    }
    public Gecko(String gecko_name, int gecko_age){
        this.name = gecko_name;
        this.age = gecko_age;
        System.out.println("Hello " + name + "!");
    }
    public String getName(){
        return name;
    }
    public void status(){
        switch(this.age){
            case 0:
                System.out.println("Unborn Gecko");
                break;
            case 1:
            case 2:
                System.out.println("Baby Gecko");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Adult Gecko");
                break;
            case 11 :
            case 12 :
            case 13 :
                System.out.println("Old Gecko");
                break;
            default:
                System.out.println("Impossible Gecko");
                break;
        }
    }
    public void setAge(int gecko_age){
        this.age = gecko_age;
    }
    public int getAge(){
        return age;
    }
    public void hello(String phrase){
        System.out.println("Hello " + phrase + ", I'm " + this.name + "!");
    }
    public void hello(int repeat_nb){
        for (int i = 0; i< repeat_nb ; i++){
            System.out.println("Hello, I'm " + this.name + "!");
        }
    }
    public void eat(String food){

        boolean food_meat = food.equalsIgnoreCase("meat");
        boolean food_vege = food.equalsIgnoreCase("vegetable");

        if (food_meat){
            System.out.println("Yummy!");

            if ((this.energy + 10) > 100){
                this.energy = 100;
            } 
            else{
                this.energy += 10;
            }
        }
        if (food_vege){
            System.out.println("Erk!");

            if ((this.energy - 10) < 0){
                this.energy = 0;
            } 
            else{
                this.energy -= 10;
            }
        }
        if (!food_meat && !food_vege){
            System.out.println("I can't eat this!");
        }
    }
    public int getEnergy(){
        return energy;
    }
    public void setEnergy(int gecko_energy){
        if (gecko_energy >= 0 || gecko_energy <= 100){
            this.energy = gecko_energy;
        }
    }
}