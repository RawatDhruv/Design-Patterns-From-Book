public class Mocha extends CondimentDecorator{
    Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
    public double getPrice(){
       return beverage.getPrice()+1.2;
    }
}
