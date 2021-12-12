package Guys;
import Enums.SweetsType;
import Object.*;
import Interfaces.enterCandies;
import java.util.Random;

public class Gunilla extends Guys implements enterCandies{
    public Gunilla(){
        super("Gunilla");
    }

    @Override
    public void collectCandies(Box box, Guys guys){
        int count = new Random().nextInt(3);
        System.out.println("Gunilla collects candies in " + box.getName() + "\n");
        guys.fillBox(new Sweets(1, SweetsType.getType().name()),box);
        System.out.println("\n");
        box.loadBox(count);
    }

    @Override
    public void getBox(Box box){
        System.out.println("Gunilla tooks a " + box.getName());
    }

    @Override
    public void giveBox(Box box,Guys guy){
        System.out.println("Gunilla gave a " + box.getName() + " to " + guy.getName());
    }

    @Override
    public void fillBox(Sweets sweets, Box box){
        System.out.println("Gunilla puts " + sweets.getName() +" in the " + box.getName());
    }

}
/*
    @Override
    public void countCandy(Sweets sweets){
        System.out.println("Gunilla counting sweets, there are " + sweets.getCount() + " " + sweets.getName());
    }

 */