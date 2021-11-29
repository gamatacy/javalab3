package Guys;
import Interfaces.BoxMoves;
import Interfaces.SweetsMoves;
import Object.*;

public class Karlson extends Guys implements BoxMoves, SweetsMoves {
    public Karlson(){
        super("Karlson");
    }

    @Override
    public void getBox(Box box){
        System.out.println("Karlson took a " + box.getName());
    }

    @Override
    public void giveBox(Box box, Guys guy){
        System.out.println("Karlson is greedy and will not give his " + box.getName() + " to anyone, not even to " + guy.getName());
    }

    @Override
    public void fillBox(Box box, Sweets sweets){
        if (sweets.getCount() > box.getCapacity()){
            System.out.println("Karlson try to put candies in the box.\nToo much candies! They doesn't fit in the box");
        }
        else{
            System.out.println("Karlson put candies in the box.");
        }
    }

    @Override
    public void countCandy(Sweets sweets){
        System.out.println("Karlson counting sweets, there are " + sweets.getCount() + " " + sweets.getName());
    }
}
/*
    public String name = "Karlson";
    public String getName() {
        return this.name;
    }

 */