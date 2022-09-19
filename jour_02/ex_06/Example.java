public class Example {
    public static void main(String[] args){
        Gecko gecko = new Gecko("mimi");
        gecko.eat("Titi");
        gecko.eat("Meat");
        gecko.eat("MEAT");
        gecko.eat("meat");
        gecko.eat("Vegetable");
        gecko.eat("VEGETABLE");
        gecko.eat("vegetable");
        System.out.println(gecko.energy);
        System.out.println(gecko.getName() + "'s energy: " + gecko.getEnergy());
        System.out.println(gecko.getName() + "'s energy: " + gecko.getEnergy());
        System.out.println(gecko.getName() + "'s energy: " + gecko.getEnergy());
        gecko.setEnergy(10);
        System.out.println(gecko.getName() + "'s energy: " + gecko.getEnergy());
    }
}
