package chocolate;
import java.util.concurrent.atomic.AtomicInteger;

public class Mars {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id = count.incrementAndGet() - 1;

    public int getId(){
        return this.id;
    }
}