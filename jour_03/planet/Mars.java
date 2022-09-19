package planet;
import java.util.concurrent.atomic.AtomicInteger;

public class Mars {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id = count.incrementAndGet() - 1;
    private String landingSite;

    public Mars(String landing){
        this.landingSite = landing;
    }

    public int getId(){
        return this.id;
    }
    public String getLandingSite(){
        return this.landingSite;
    }
}