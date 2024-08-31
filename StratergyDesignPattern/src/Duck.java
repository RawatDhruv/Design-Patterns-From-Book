public abstract class Duck {
    QuackBehaviour quackBehaviour;
    FlyBehaviour flyBehaviour;

    public Duck() {};

    public void fly(){
        flyBehaviour.fly();
    }
    public void quack(){
        quackBehaviour.quack();
    };

    public abstract void display();

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }
    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
