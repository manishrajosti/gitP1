public class ToyCar extends Car implements Engine, Speed {




    public ToyCar() {

    }

    @Override
    public void engineType() {
        System.out.println("Sports car engine type: AA battery powered motor");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Toy car max speed: 1mph");
    }
}
//Toy car max speed: 1mph
//
//Sports car engine type: AA battery powered motor