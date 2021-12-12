package Guys;
import Object.*;
public abstract class Guys {
    public String name;

    public Guys(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public abstract void getBox(Box box);

    public abstract void giveBox(Box box, Guys guy);
    public abstract void fillBox(Sweets sweets, Box box);
}
