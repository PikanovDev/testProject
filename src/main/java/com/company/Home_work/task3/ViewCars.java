package com.company.Home_work.task3;

public class ViewCars {

    public final String INPUT_YEAR_OF_ISSUE = "Input year of issue: ";
    public final String BASE_MESSAGE = "List of cars sorted by brand %s: ";

    public void  showMessage(String message){
        System.out.println(message);
    }

    public void showCars (String message, Car[] cars){
        System.out.println(String.format(BASE_MESSAGE, message));
        for (Car car: cars) {
            if(car != null){
                System.out.println(car.toString());
            }
        }
    }
}
