
public class Fish {
    String fishName;
    String typeOfFish;
    int friendliness;

    public Fish() {
        fishName = "Unknown";
        typeOfFish = "Unknown";
        friendliness = 3;
    }

    public Fish(String name, String type, int f) {
        fishName = name;
        typeOfFish = type;
        friendliness = f;
    }

    public int getFriendliness() {
        return friendliness;
    }

    @Override
    public String toString() {
        return fishName + " (" + typeOfFish
                + "), friendliness: " + friendliness;
    }
}
