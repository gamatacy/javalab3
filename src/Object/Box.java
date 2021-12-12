package Object;

public class Box extends Object {
    public int capacity = 0;

    public Box(String name){
        super(name);
    }

    public Box(String name, int count){
        super(name);
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void loadBox(int count){
        this.capacity += count;
    }
}
