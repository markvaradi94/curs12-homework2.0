package ro.fasttrackit.curs12.homeworkV2.extramile;

public class Main {
    public static void main(String[] args) {
        CarShop shop = new CarShop();
        shop.addCar(new Car("Ford Mondeo", 10, 150000, 5500));
        shop.addCar(new Car("Volvo V60", 4, 50000, 11500));
        shop.addCar(new Car("Nissan Patrol", 20, 260000, 5800));
        shop.addCar(new Car("Mercedes C-Class", 11, 157000, 9000));
        shop.addCar(new Car("Ford Mondeo", 2, 30000, 25500));
        shop.addCar(new Car("Audi A6", 1, 5000, 35750));
        shop.addCar(new Car("Toyota Auris", 3, 51245, 11500));
        shop.addCar(new Car("Nissan Patrol", 5, 75412, 9500));
        shop.addCar(new Car("Volvo V60", 12, 200000, 4500));
        shop.addCar(new Car("Ford Mondeo", 17, 250000, 2200));
        shop.addCar(new Car("Mercedes C-Class", 1, 9000, 49500));
        shop.addCar(new Car("VW Golf", 11, 275000, 3700));
        shop.addCar(new Car("VW Golf", 16, 360000, 1600));
        shop.addCar(new Car("Dacia Logan", 2, 7400, 68000));
        shop.addCar(new Car("Dacia 1310", 37, 550000, 85000));
        shop.addCar(new Car("Lada Niva", 40, 742900, 120000));

        KilometerRange kilometerRange = new KilometerRange();
        PriceRange priceRange = new PriceRange();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(shop.getCarList());
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(shop.numberOfCarsByName());
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(shop.carsByNameAndKilometers());
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(shop.carsByKilometerRange(kilometerRange));
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(shop.carsByPriceRange(priceRange));
        System.out.println("-----------------------------------------------------------------------------------------");
        kilometerRange.setKilometerRange(15000, 10000);
        System.out.println(shop.carsByKilometerRange(kilometerRange));
        System.out.println("-----------------------------------------------------------------------------------------");
        kilometerRange.setKilometerRange(20000,30000);
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(shop.carsByKilometerRange(kilometerRange));
        System.out.println("-----------------------------------------------------------------------------------------");
        priceRange.setPriceRange(7000,5000);
        priceRange.setPriceRange(10000,15000);
        System.out.println(shop.carsByPriceRange(priceRange));
        System.out.println("-----------------------------------------------------------------------------------------");
        kilometerRange.setKilometerRange(300000,800000);
        System.out.println(shop.carsByKilometerRange(kilometerRange));
        System.out.println("-----------------------------------------------------------------------------------------");
        priceRange.setPriceRange(49500,120000);
        System.out.println(shop.carsByPriceRange(priceRange));
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
