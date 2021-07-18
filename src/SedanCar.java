public class SedanCar extends Car implements Engine, Speed {


    public SedanCar() {

    }

    @Override
    public void engineType() {
        System.out.println("Sports car engine type: Turbocharged inline 4");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Sedan car max speed: 150mph");
    }
}
//Sedan car max speed: 150mph
//
//Sports car engine type: Turbocharged inline 4