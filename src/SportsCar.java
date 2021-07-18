public class SportsCar extends Car implements Engine, Speed {



    public SportsCar() {
        super();
    }

    public void engineType() {
        System.out.println("Sports car engine type: Twin turbo V8");
    }


    public void maxSpeed() {
        System.out.println("Sports car max speed: 400mph");
    }

}

//Sports car max speed: 400mph
//
//Sports car engine type: Twin turbo V8