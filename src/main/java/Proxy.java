/**
 * Created by hjing on 1/10/17.
 */
public class Proxy implements GiveGift {
    Pursuit xiaoming;
    public Proxy(SchoolGirl sg)
    {
        xiaoming = new Pursuit(sg);
    }
    public void giveChoclate() {
        xiaoming.giveChoclate();
    }
    public void giveFlower() {
        xiaoming.giveFlower();
    }
    public void giveDoll() {
        xiaoming.giveDoll();
    }
}
