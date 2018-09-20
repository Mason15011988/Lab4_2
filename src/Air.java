public class Air extends Transport {
    private double wingSpan;
    private double minInFly;

    public Air(String marka, int power, int maxSpeed, int weight, double wingSpan, double minInFly) {
        super(marka, power, maxSpeed, weight);
        this.wingSpan = wingSpan;
        this.minInFly = minInFly;
    }

    public Air() {

    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public double getMinInFly() {
        return minInFly;
    }

    public void setMinInFly(double minInFly) {
        this.minInFly = minInFly;
    }
}
