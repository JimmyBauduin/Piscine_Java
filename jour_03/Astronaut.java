import java.util.concurrent.atomic.AtomicInteger;

public class Astronaut {

    private String name;
    private int snacks = 0;
    private String destination = null;

    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id = count.incrementAndGet() - 1;

    public Astronaut(String astro_name){
        this.name = astro_name;
        System.out.println(astro_name + " ready for launch!");
    }
    public int getId(){
        return this.id;
    }
    public int getSnacks(){
        return this.snacks;
    }
    public String getName(){
        return this.name;
    }
    public Object getDestination(){
        return this.destination;
    }
    public void doActions(){
        System.out.println(this.name + ": Nothing to do.");
        if (this.destination == null ){
            System.out.println(this.name + ": I may have done nothing, but I have " + this.snacks + " Mars to eat at least!");
        }
    }
    public void doActions(planet.Mars new_destination){
        this.destination = new_destination.getLandingSite();
        System.out.println(this.name + ": Started a mission!");
    }
    public void doActions(chocolate.Mars new_snack){
        this.snacks++;
        System.out.println(this.name + ": Thanks for this mars number " + new_snack.getId());
        if (this.destination == null ){
            System.out.println(this.name + ": I may have done nothing, but I have " + this.snacks + " Mars to eat at least!");
        }
        
    }
}
