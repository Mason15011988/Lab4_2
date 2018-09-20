public class PlaneVar extends Air {
    private boolean catapult;
    private int roket;
    private String yes;

    public PlaneVar(String marka, int power, int maxSpeed, int weight, double wingSpan, double minInFly, boolean catapult, int roket) {
        super(marka, power, maxSpeed, weight, wingSpan, minInFly);
        this.catapult = catapult;
        this.roket = roket;
    }

    public PlaneVar(){

    }

    public boolean isCatapult() {
        return catapult;
    }

    public void setCatapult(boolean catapult) {
        this.catapult = catapult;
    }

    public int getRoket() {
        return roket;
    }

    public void setRoket(int roket) {
        this.roket = roket;
    }

    public void vid (){
        double rez = powerkB();
        if (catapult){
            yes = "есть";
        }else{
            yes = "нет";
        }
        System.out.println("Военный воздушный транспорт:");
        System.out.println("Марка - " + getMarka());
        System.out.println("Мощность - " + getPower() + " л.с или " + rez + " кВ");
        System.out.println("Максимальная скорость - "+ getMaxSpeed() + " км/ч"  );
        System.out.println("Масса - " + getWeight() + " кг");
        System.out.println("Размах крыльев - " + getWingSpan() + " м");
        System.out.println("Минимальная длинна взлетно-посадочной полосы для взлета - " + getMinInFly() + " м");
        System.out.println("Наличие системы катапультирования - " + yes);
        System.out.println("Количество ракет на борту - " + roket );
        System.out.println();
    }

    private void roketNal(){
        if (roket > 0){
            System.out.println("Ракета пошла");
        }else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }
    private void katapult(){
        if (catapult){
            System.out.println("Катапультирование прошло успнешно");
        }else {
            System.out.println("У вас нет  системы катапультирования");
        }
    }

    public void test(){
        System.out.println("Проверка военного воздушного транспорта:");
        roketNal();
        katapult();
        System.out.println();
    }
}
