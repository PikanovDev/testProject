package com.company.Home_work.task3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class ControllerCars {

    private RepositoryCars repositoryCars;
    private FilterCars filterCars;
    private ViewCars viewCars;

    public ControllerCars(RepositoryCars repositoryCars, FilterCars filterCars, ViewCars viewCars) {
        this.repositoryCars = repositoryCars;
        this.filterCars = filterCars;
        this.viewCars = viewCars;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
//        inputParamFind(scanner);
        CarBrand carBrand = inputBrand(scanner);
        scanner.close();
        viewCars.showCars(carBrand.name(), filterCars.selectBrand(carBrand, repositoryCars));
    }

    private CarBrand inputBrand(Scanner scanner) {
        String brand;
        System.out.println(Arrays.asList(CarBrand.values()));
        System.out.println("For exit from this application press - q");
        brand = scanner.nextLine();
        if (brand.equals("q")) {
            System.exit(0);
        }
        try {
            return CarBrand.valueOf(brand);
        } catch (IllegalArgumentException e) {
            System.out.println("No brand");
            return inputBrand(scanner);
        }

    }

//    private Car inputParamFind (Scanner scanner){
//        Car car = new Car();
//        viewCars.showMessage(viewCars.INPUT_YEAR_OF_ISSUE);
//        String tmp = LocalDateTime.now().minusYears(scanner.nextInt()).format(DateTimeFormatter.ofPattern("yyyy"));
//        car.setYearOfIssue(new Integer(tmp));
//        System.out.println(viewCars.BASE_MESSAGE);
//        car.setYearOfIssue(scanner.nextInt());
//        car.setBrand(inputBrand(scanner));
//        return car;
//    }
}



