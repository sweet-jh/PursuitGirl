/**
 * Created by hjing on 1/10/17.
 */
public class Pursuit implements GiveGift {
    SchoolGirl sg;

    public Pursuit(SchoolGirl sg)
    {
        this.sg = sg;
    }
    public void giveChoclate() {
        System.out.println("Give you choclate," + sg.getName());
    }
    public void giveFlower() {
        System.out.println("Give you flower," + sg.getName());
    }
    public void giveDoll() {
        System.out.println("Give you doll," + sg.getName());
    }
}
