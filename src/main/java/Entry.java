/**
 * Created by hjing on 1/10/17.
 */
public class Entry {
    static public void main(String[] args)
    {
        SchoolGirl xiaoli = new SchoolGirl("xiaoli");
        Proxy daili = new Proxy(xiaoli);

        daili.giveFlower();
        daili.giveChoclate();
        daili.giveDoll();
    }
}
