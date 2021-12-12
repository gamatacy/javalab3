package Guys;
import Enums.*;
import java.util.Random;
import Object.*;

public class OtherGuys extends Guys{
    int count;
    public OtherGuys(int count){
        super("Other guys");
        this.count = count;
    }

    public void fillBox(Sweets sweets, Box box){
        for (int i = 0; i < this.count; i++){
            System.out.println(Names.getName(i).name() + " puts " + SweetsType.getType().name() + " in the " + box.getName());
        }
    }
    public void getBox(Box box){}

    public void giveBox(Box box, Guys guy){}
}
