public class Box extends Object {
    public int capacity;

    public Box(int capacity, String name){
        super(name);
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }

}
