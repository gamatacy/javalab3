package Guys;
import Interfaces.greedilyCount;
import Object.*;

public class Karlson extends Guys implements greedilyCount{
    public Boolean candyStatus = false;

    public Karlson(){
        super("Karlson");
    }

    public void getCandyStatus(){
        if (this.candyStatus == true){
            System.out.println("Karlson has a candies");
        }
        else{
            System.out.println("Karlson hasn't a candies");
        }
    }

    @Override
    public void getBox(Box box){
        System.out.println("Karlson tooks a " + box.getName());
    }

    @Override
    public void giveBox(Box box, Guys guy){
        System.out.println("Karlson is greedy and will not give his " + box.getName() + " to anyone, not even to " + guy.getName());
    }

    @Override
    public void fillBox(Sweets sweets, Box box){
        System.out.println("Karlson put " + sweets.getName() +" in the " + box.getName());
    }

    @Override
    public void greedyCount(Sweets sweets){
        System.out.println("Karlson is greedily counting sweets, there are " + sweets.getCount() + " candies");
        if (sweets.getCount() > 0) {
            candyStatus = true;
            }
        else {
            candyStatus = false;
            }
    }
}
/*
    public String name = "Karlson";
    public String getName() {
        return this.name;
    }
    if (sweets.getCount() > box.getCapacity()){
                System.out.println("Karlson try to put candies in the box.\nToo much candies! They doesn't fit in the box");
            }
            else{
                System.out.println("Karlson put candies in the box.");
            }
 */