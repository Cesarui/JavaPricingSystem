// Cesar Pimentel
import org.junit.Test;

// Tester class, instantiating objects to see if everything works accordingly!
public class Tester {

    @Test
    public void test(){
        Tablet tablet1 = new Tablet(1.1,4,5,8);
        Laptop laptop1 = new Laptop(1.1,4,5,true);

        System.out.println(tablet1.getShippingCost());
        System.out.println(laptop1);
    }

}
