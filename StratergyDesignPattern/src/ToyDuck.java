public class ToyDuck extends Duck{

    public ToyDuck() {
        flyBehaviour = new FlyWithoutWings();
        quackBehaviour = new Squeak();
    };
    public void display(){
        System.out.println("Toy Duck");
    }

}
