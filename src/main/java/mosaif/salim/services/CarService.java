package mosaif.salim.services;

import mosaif.salim.models.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarService {
    public List<Car> cars = new ArrayList<>(Arrays.asList(
            new Car(1L, "TOYOTA", "COROLLA", "Blue", "A-5-753", 2020, 15000),
            new Car(2L, "FORD", "MUSTANG", "Red", "C-6-159", 2020, 18000)
    ));
    // C-CREATE
    public void addCar(Car car){
        cars.add(car);
    }
    // R-READ
    public List<Car> getCars(){
        return cars;
    }
    public Car getCar(Long id){
        for (Car car : cars){
            if (car.getcId().equals(id)) return car;
        }
        return null;
    }
    // U-UPDATE
    public void updateCar(Long id, Car car){
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getcId().equals(id)){
                cars.set(i, car);
                return;
            }
        }
    }
    // D-DELETE
    public void deleteCar(Long id){
        cars.removeIf(car -> car.getcId().equals(id));
    }
    public void clearCars() {
        cars.clear();
    }
    // COUNT
    public int countCars(){
        return cars.size();
    }
}
