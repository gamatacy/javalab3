public class Karlson extends Guys implements ObjectMoves{
    public Karlson(){
        super("Karlson");
    }

    @Override
    public void getBox(Box box){
        System.out.println("Karlson took a " + box.getName());
    }

    @Override
    public void countCandy(Sweets sweets){
        System.out.println("Karlson counting sweets, there are " + sweets.getCount() + " " + sweets.getName());
    }

    @Override
    public void giveBox(Box box, Guys guy){
        System.out.println("Karlson is greedy and will not give his " + box.getName() + " to anyone, not even to " + guy.getName());
    }
}
/*
    public String name = "Karlson";
    public String getName() {
        return this.name;
    }

 */