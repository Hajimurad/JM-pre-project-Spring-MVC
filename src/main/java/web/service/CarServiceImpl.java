package web.service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    public List<Car> cars;

    {
        cars = new ArrayList();
        cars.add(new Car("Nissan R35", "sport", 2016));
        cars.add(new Car("Pontiac GTO", "muscle", 1969));
        cars.add(new Car("Mercedes-Benz E63", "sport", 2021));
        cars.add(new Car("Hyundai Solaris", "family car", 2017));
        cars.add(new Car("Dodge Charger", "muscle", 1971));
    }

    @Override
    public List<Car> getCars(Integer count) {

        if (count > 0 && count <= cars.size()) {
            return cars.subList(0, count);
        } else if (count > cars.size()) {
            return cars;
        } else {
            return null;
        }
    }
}