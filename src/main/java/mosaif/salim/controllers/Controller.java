package mosaif.salim.controllers;

import mosaif.salim.models.Car;
import mosaif.salim.services.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    private final CarService carService;
    public Controller(CarService carService) {
        this.carService = carService;
    }

    @RequestMapping("/")
    public String Welcome(){
        return "Connected to the Springboot successfully!";
    }
    @RequestMapping(value = "/cars", method = RequestMethod.POST)
    public void addCar(@RequestBody Car car){
        carService.addCar(car);
    }
    @RequestMapping("/cars")
    public List<Car> getAllCars(){
        return carService.getCars();
    }
    @RequestMapping("/cars/{id}")
    public Car getCar(@PathVariable Long id){
        return carService.getCar(id);
    }
    @RequestMapping(value = "/cars/{id}", method = RequestMethod.PUT)
    public void updateCar(@PathVariable Long id, @RequestBody Car car){
        carService.updateCar(id, car);
    }
    @RequestMapping(value = "/cars/{id}", method = RequestMethod.DELETE)
    public void deleteCar(@PathVariable Long id){
        carService.deleteCar(id);
    }
    @RequestMapping(value = "/cars/purge")
    public void clearCars(){
        carService.clearCars();
    }
    @RequestMapping("/cars/count")
    public String countCars(){
        return "There are " + carService.countCars() + " cars available.";
    }
}
