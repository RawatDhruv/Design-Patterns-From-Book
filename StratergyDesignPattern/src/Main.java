//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Duck duck = new ToyDuck();
        duck.display();
        duck.quack();
        duck.fly();
        Duck duck2 = new RealDuck();
        duck2.display();
        duck2.quack();
        duck2.fly();
        System.out.println("cutting of Real Duck wings");
        duck2.setFlyBehaviour(new FlyWithoutWings());
        duck2.fly();

    }
}