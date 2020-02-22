package ro.fasttrackit.curs12.homeworkV2.extramile;

import java.util.*;

public class CarShop {
    private List<Car> carList = new ArrayList<>();

    public void addCar(Car car) {
        this.carList.add(car);
    }

    public List<Car> getCarList() {
        return carList;
    }

    private Set<String> carNames() {
        Set<String> carNames = new HashSet<>();
        for (Car car : this.carList) {
            carNames.add(car.getName());
        }
        return carNames;
    }

    public Map<String, Integer> numberOfCarsByName() {
        Map<String, Integer> result = new HashMap<>();
        Set<String> carNames = carNames();
        for (String name : carNames) {
            int count = 0;
            for (Car car : this.carList) {
                if (car.getName().toLowerCase().equals(name.toLowerCase())) {
                    count++;
                }
                result.put(name, count);
            }
        }
        return result;
    }

    public Map<String, List<Integer>> carsByNameAndKilometers() {
        Map<String, List<Integer>> result = new HashMap<>();
        for (Car car : this.carList) {
            if (!result.containsKey(car.getName())) {
                result.put(car.getName(), new ArrayList<>());
            }
            result.get(car.getName()).add(car.getKilometers());
        }
        return result;
    }

    public Map<KilometerRange, List<Car>> carsByKilometerRange(KilometerRange kilometerRange) {
        Map<KilometerRange, List<Car>> result = new HashMap<>();
        for (Car car : this.carList) {
            if (car.getKilometers() >= kilometerRange.getMinRange() && car.getKilometers() <= kilometerRange.getMaxRange()) {
                if (!result.containsKey(kilometerRange)) {
                    result.put(kilometerRange, new ArrayList<>());
                }
                result.get(kilometerRange).add(car);
            }
        }
        return result;
    }

    public Map<PriceRange, List<Car>> carsByPriceRange(PriceRange priceRange) {
        Map<PriceRange, List<Car>> result = new HashMap<>();
        for (Car car : this.carList) {
            if (car.getPrice() >= priceRange.getMinRange() && car.getPrice() <= priceRange.getMaxRange()) {
                if (!result.containsKey(priceRange)) {
                    result.put(priceRange, new ArrayList<>());
                }
                result.get(priceRange).add(car);
            }
        }
        return result;
    }
}
