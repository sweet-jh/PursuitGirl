import org.junit.Test;

/**
 * Created by hjing on 1/10/17.
 */
public class ProxyTest {
    @Test
    public void testCallMethod()
    {
        SchoolGirl xiaoli = new SchoolGirl("xiaoli");
        Proxy proxy = new Proxy(xiaoli);
        //////不会写
    }
}
