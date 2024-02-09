public class Group {
    private String name;
    private int countOfTourists;
    private Tourist[] tourists;

    public Group(String name, int countOfTourists) {
        this.name = name;
        this.countOfTourists = countOfTourists;
        tourists = new Tourist[countOfTourists];
    }

    public void addTourist(Tourist tourist, int index) {
        tourists[index] = tourist;
    }

    public boolean canGoToExpedition() {
        int totalMoney = 0;

        for( int i=0; i <tourists.length; i++) {
            if (tourists[i].getAccess().equals("YES")) {
                totalMoney += tourists[i].getMoney();
            }
        }

        return totalMoney >= 20000;
    }

}
