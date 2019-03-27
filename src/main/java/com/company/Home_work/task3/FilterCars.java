package com.company.Home_work.task3;

public class FilterCars {


    public Car[] selectBrand(CarBrand brand, RepositoryCars repositoryCars) {
        Car[] cars = new Car[repositoryCars.getCars().length];
        int count = 0;
        for (Car car : repositoryCars.getCars()) {
            if (brand.equals(car.getBrand())) {
                cars[count] = car;
                count++;
            }
        }
        return cars;
    }
    public Car[] selectAgeOfCars(Car paramCar, RepositoryCars repositoryCars) {
        Car[] cars = new Car[repositoryCars.getCars().length];
        int count = 0;
        for (Car car : repositoryCars.getCars()) {
            if (paramCar.getYearOfIssue() <= car.getYearOfIssue()) {
                cars[count] = car;
                count++;
            }
        }
        return cars;
    }

}
