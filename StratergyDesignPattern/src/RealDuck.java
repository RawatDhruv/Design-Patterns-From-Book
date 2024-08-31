public class RealDuck extends Duck{

    public RealDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    };
    public void display() {
        System.out.println("I'm a real duck");
    }

}
