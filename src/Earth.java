public class Earth extends Transport {
    private int amountWheel;
    private int spendFuel;

    public Earth(String marka, int power, int maxSpeed, int weight, int amountWheel, int spendFuel) {
        super(marka, power, maxSpeed, weight);
        this.amountWheel = amountWheel;
        this.spendFuel = spendFuel;
    }

    public Earth() {

    }

    public int getAmountWheel() {
        return amountWheel;
    }

    public void setAmountWheel(int amountWheel) {
        this.amountWheel = amountWheel;
    }

    public int getSpendFuel() {
        return spendFuel;
    }

    public void setSpendFuel(int spendFuel) {
        this.spendFuel = spendFuel;
    }
}
