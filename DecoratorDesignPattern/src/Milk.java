public class Milk extends CondimentDecorator {
    Beverage beverage;
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
    public double getPrice(){
        return beverage.getPrice()+0.80;
    }

}
