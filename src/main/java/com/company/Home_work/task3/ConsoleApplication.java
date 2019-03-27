package com.company.Home_work.task3;

public class ConsoleApplication {
    public static void main(String[] args) {
        ControllerCars controllerCars = new ControllerCars(new RepositoryCars(), new FilterCars(), new ViewCars());
        controllerCars.run();
    }

}
