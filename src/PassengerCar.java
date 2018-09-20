import java.util.Scanner;

public class PassengerCar extends Earth {
    private String typeBody;
    private int numberPassengers;
    private Scanner scanner = new Scanner(System.in);

    public PassengerCar(String marka, int power, int maxSpeed, int weight, int amountWheel, int spendFuel, String typeBody, int numberPassengers) {
        super(marka, power, maxSpeed, weight, amountWheel, spendFuel);
        this.typeBody = typeBody;
        this.numberPassengers = numberPassengers;
    }

    public PassengerCar(){

    }

    public String getTypeBody() {
        return typeBody;
    }

    public void setTypeBody(String typeBody) {
        this.typeBody = typeBody;
    }

    public int getNumberPassengers() {
        return numberPassengers;
    }

    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    public void vid (){
        double rez = powerkB();
        System.out.println("Легковой наземный транспорт:");
        System.out.println("Марка - " + getMarka());
        System.out.println("Мощность - " + getPower() + " л.с или " + rez + " кВ");
        System.out.println("Максимальная скорость - "+ getMaxSpeed() + " км/ч " );
        System.out.println("Масса - " + getWeight() + " кг");
        System.out.println("Количество колес - " + getAmountWheel());
        System.out.println("Расход топлива - " + getSpendFuel() + " л/100км");
        System.out.println("Тип кузова - " + typeBody);
        System.out.println("Количество пассажиров - " + numberPassengers);
        System.out.println();
    }

    public double km (double time){
        double skm = time * getMaxSpeed();
        return skm;
    }

    private double fuel (double time){
        double sfuel = time * getMaxSpeed() * getSpendFuel() / 100 ;
        return sfuel;
    }

    public void test(){
        System.out.println("Введите время(ч) для расчета километража и расхода топлива");
       double time = scanner.nextDouble();
       double kilometrez = km(time);
       double litres = fuel(time);
        System.out.println("За время " + time + "ч, автомобиль " + getMarka() + " двигаясь с максимальной скоростью "
                + getMaxSpeed() + "км/ч  проедет " + kilometrez + "км и израсходует " + litres + " литров топлива");
        System.out.println();
    }
}
