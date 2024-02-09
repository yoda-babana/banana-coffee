public class Club {
    String name;
    Player[] players;

    public Club() {
        this.name = "";
        this.players = new Player[0];
    }

    public Club(String name, Player[] players) {
        this.name = name;
        this.players = players;
    }

    void printClubData() {
        System.out.println(this.name);
        for (int k = 0; k < this.players.length; k++) {
            System.out.println(this.players[k].getPlayerData());
        }
    }

    void printSquad() {
        for (int k = 0; k < this.players.length; k++) {
            if (this.players[k].isInjured() == false) {
                System.out.println(this.players[k].getNumber() + " " + this.players[k].getName() +
                        " " + this.players[k].getPosition());
            }
        }
    }
}

