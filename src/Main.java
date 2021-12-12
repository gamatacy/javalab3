import Object.*;
import Guys.*;
import Interfaces.*;
import Enums.*;

public class Main {
    public static void main(String []args) {
        Kirre kirre = new Kirre();
        Karlson karlson = new Karlson();
        Gunilla gunilla = new Gunilla();
        Sweets sweets = new Sweets(1, SweetsType.getType().name());
        Box candyBox = new Box( "Enter Box");
        Box kulek = new Box( "Kulek",6);
        OtherGuys otherGuys = new OtherGuys(5);
        karlson.getCandyStatus();
        kirre.giveBox(kulek,karlson);
        karlson.getBox(kulek);
        gunilla.collectCandies(candyBox, otherGuys);
        karlson.greedyCount(sweets);
        karlson.getCandyStatus();
    }
}
