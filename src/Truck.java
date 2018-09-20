import java.util.Scanner;

public class Truck extends Earth {
    private double ton;
    private Scanner scanner = new Scanner(System.in);

    public Truck(String marka, int power, int maxSpeed, int weight, int amountWheel, int spendFuel, double ton) {
        super(marka, power, maxSpeed, weight, amountWheel, spendFuel);
        this.ton = ton;
    }

    public Truck(){

    }

    public double getTon() {
        return ton;
    }

    public void setTon(double ton) {
        this.ton = ton;
    }

    public void vid (){
        double rez = powerkB();
        System.out.println("Грузовой наземный транспорт:");
        System.out.println("Марка - " + getMarka());
        System.out.println("Мощность - " + getPower() + " л.с или " + rez + " кВ");
        System.out.println("Максимальная скорость - "+ getMaxSpeed() + " км/ч " );
        System.out.println("Масса - " + getWeight() + " кг");
        System.out.println("Количество колес - " + getAmountWheel());
        System.out.println("Расход топлива - " + getSpendFuel() + " л/100км");
        System.out.println("Грузоподьемность - " + ton + "т");
        System.out.println();
    }

    public void test(){
        System.out.println("Введите количество груза(т) для проверки грузоподьемности");
        double kol = scanner.nextDouble();
        if (kol <= ton){
            System.out.println("Грузовик загружен");
        }else System.out.println("Вам нужен грузовик побольше");
        System.out.println();
    }
}
