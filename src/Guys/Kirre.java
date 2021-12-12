package Guys;
import Object.*;

import java.util.Random;
public class Kirre extends Guys{
    public Kirre(){
        super("Kirre");
    }

    @Override
    public void getBox(Box box){
        System.out.println("Kirre tooks a " + box.getName());
    }

    @Override
    public void giveBox(Box box,Guys guy){
        System.out.println("Kirre gave a " + box.getName() + " to " + guy.getName() + ", but managed to put " + (new Random().nextInt(2)+1) + " candy in his mouth");
    }
    @Override
    public void fillBox(Sweets sweets, Box box){
        System.out.println("Kirre put " + sweets.getName() +" in the " + box.getName());
    }

}
/*
    @Override
    public void countCandy(Sweets sweets){
        System.out.println("Kirre counting sweets, there are " + sweets.getCount() + " " + sweets.getName());
    }
   if (sweets.getCount() > box.getCapacity()){
        System.out.println("Kirre try to put candies in the box.\nToo much candies! They doesn't fit in the box");
    }
    else{
        System.out.println("Kirre put candies in the box.");
    }
 */