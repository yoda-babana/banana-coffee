import java.lang.reflect.Array;

public class Player {
    String name;
    String position;
    int number;
    boolean isInjured;

    public Player() {
        this.name = "";
        this.position = "";
        this.number = 0;
        this.isInjured = true;
    }

    public Player(String name, String position, int number, boolean isInjured) {
        this.name = name;
        this.position = position;
        this.number = number;
        this.isInjured = isInjured;
    }

    public String getPlayerData() {
        return "Name: " + name + "\nPosition: " + position + "\nNumber: " + number + "\nIs Injured: " + isInjured;
    }

    public String getName() {
        return name;
    }


    public String getPosition() {
        return position;
    }

    public int getNumber() {
        return number;
    }


    public boolean isInjured() {
        return isInjured;
    }

}




