package Guys;
import Interfaces.BoxMoves;
import Interfaces.SweetsMoves;
import Object.*;

public class Gunilla extends Guys implements BoxMoves, SweetsMoves {
    public Gunilla(){
        super("Gunilla");
    }

    @Override
    public void getBox(Box box){
        System.out.println("Gunilla took a " + box.getName());
    }

    @Override
    public void giveBox(Box box,Guys guy){
        System.out.println("Gunilla gave a " + box.getName() + " to " + guy.getName());
    }

    @Override
    public void fillBox(Box box, Sweets sweets){}

    @Override
    public void countCandy(Sweets sweets){
        System.out.println("Gunilla counting sweets, there are " + sweets.getCount() + " " + sweets.getName());
    }
}
