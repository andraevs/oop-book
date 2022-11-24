package atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Order {
//    static int idCount = 0;
    static AtomicInteger atomicInteger=new AtomicInteger(0);
    int id;
    Order(){
//        id = idCount++;
        id=atomicInteger.getAndIncrement();
    }


    @Override
    public String toString() {
        return "Order id=" + id;
    }
}
