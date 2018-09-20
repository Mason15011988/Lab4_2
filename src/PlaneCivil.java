import java.util.Scanner;

public class PlaneCivil extends Air {
    private int numberPassengers;
    private boolean businessClass;
    private String yes;
    private Scanner scanner = new Scanner(System.in);

    public PlaneCivil(String marka, int power, int maxSpeed, int weight, double wingSpan, double minInFly, int numberPassengers, boolean businessClass) {
        super(marka, power, maxSpeed, weight, wingSpan, minInFly);
        this.numberPassengers = numberPassengers;
        this.businessClass = businessClass;
    }

    public PlaneCivil(){

    }

    public int getNumberPassengers() {
        return numberPassengers;
    }

    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    public void vid (){
        double rez = powerkB();
        if (businessClass){
             yes = "есть";
        }else{
             yes = "нет";
        }
        System.out.println("Гражданский воздушный транспорт:");
        System.out.println("Марка - " + getMarka());
        System.out.println("Мощность - " + getPower() + " л.с или " + rez + " кВ");
        System.out.println("Максимальная скорость - "+ getMaxSpeed() + " км/ч"  );
        System.out.println("Масса - " + getWeight() + " кг");
        System.out.println("Размах крыльев - " + getWingSpan() + " м");
        System.out.println("Минимальная длинна взлетно-посадочной полосы для взлета - " + getMinInFly() + " м");
        System.out.println("Количество пассажиров - " + numberPassengers);
        System.out.println("Наличие бизнес класса - " + yes);
        System.out.println();
    }

    public void test(){
        System.out.println("Введите количество пассажиров(чел) для проверки вместимости самолета");
        double kol = scanner.nextDouble();
        if (kol <= numberPassengers){
            System.out.println("Самолет не переполнен");
        }else System.out.println("Вам нужен другой самолет");
        System.out.println();
    }
}
