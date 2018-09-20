public class Transport {
    private String marka;
    private int power;
    private int maxSpeed;
    private int weight;

    public Transport(String marka, int power, int maxSpeed, int weight) {
        this.marka = marka;
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }
    public Transport(){

    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double powerkB(){
        double rez = power * 0.74;
        return rez;
    }
}
