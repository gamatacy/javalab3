public class Main {
    public static void main(String []args) {
        Kirre kirre = new Kirre();
        Karlson karlson = new Karlson();
        Gunilla gunilla = new Gunilla();
        Sweets sweets = new Sweets(5, SweetsType.getType().name());
        Box candyBox = new Box(10, "CandyBox");
        Box kulek = new Box(10, "Kulek");
        kirre.giveBox(kulek,karlson);
        karlson.getBox(kulek);
        gunilla.giveBox(candyBox, karlson);
        karlson.getBox(candyBox);
        karlson.countCandy(sweets);
    }
}