package planet.moon;
import planet.*;

public class Phobos {

    private Mars mars;
    private String landingSite;

    public Phobos(){
        System.out.println("No planet given.");
    }
    public Phobos(Mars planet, String landing){
        this.mars = planet;
        this.landingSite = landing;
        System.out.println("Phobos placed in orbit");
    }
    public Mars getMars(){
        return this.mars;
    }

    public String getLandingSite(){
        return this.landingSite;
    }
}
