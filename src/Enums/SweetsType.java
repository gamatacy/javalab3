import java.util.Random;
public enum SweetsType {
    Cow,
    KitKat,
    Snickers,
    Toffifee,
    MilkyWay,
    Bounty;

    public static SweetsType getType(){
        return SweetsType.values()[new Random().nextInt(5)];
    }

}
