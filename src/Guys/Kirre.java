import java.util.Random;
public class Kirre extends Guys implements ObjectMoves{
    public Kirre(){
        super("Kirre");
    }

    @Override
    public void getBox(Box box){
        System.out.println("Kirre took a " + box.getName());
    }

    @Override
    public void giveBox(Box box,Guys guy){
        System.out.println("Kirre gave a " + box.getName() + " to " + guy.getName() + ", but managed to put " + (new Random().nextInt(5)) + " candy in his mouth");
    }

    @Override
    public void countCandy(Sweets sweets){
        System.out.println("Kirre counting sweets, there are " + sweets.getCount() + " " + sweets.getName());
    }

}
