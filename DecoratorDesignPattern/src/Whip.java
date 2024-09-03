public class Whip extends CondimentDecorator{
    Beverage beverage;
    Whip(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription() + ", Whip";
    }

    public double getPrice(){
        return beverage.getPrice()+1.5;
    }
}
