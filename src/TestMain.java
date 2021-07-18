public class TestMain {
    public static void main(String[] args) {
        Car sport = new SportsCar();
        Car sedan = new SedanCar();
        Car toy = new ToyCar();

        sport.showSpeed();
        sport.showEngine();
        sport.toString();
        System.out.println();


        sedan.showSpeed();
        sedan.showEngine();
        sedan.toString();
        System.out.println();

        toy.showSpeed();
        toy.showEngine();
        toy.toString();
    }
}

