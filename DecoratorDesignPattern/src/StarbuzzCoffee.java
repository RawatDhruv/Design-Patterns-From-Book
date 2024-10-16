

public class StarbuzzCoffee {
    public static void main(String[] args) {
        System.out.println("Creating Espresso");
        Beverage beverage = new Espresso();
        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.getPrice());
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.getPrice());
        System.out.println("Adding double milk");
        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.getPrice());


        System.out.println("Creating Americano");
        Beverage beverage2 = new Americano();
        beverage2 = new Milk(beverage2);
        System.out.println(beverage2.getDescription());
        System.out.println(beverage2.getPrice());
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription());
        System.out.println(beverage2.getPrice());
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription());
        System.out.println(beverage2.getPrice());

    }
}