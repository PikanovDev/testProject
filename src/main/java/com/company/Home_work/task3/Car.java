package com.company.Home_work.task3;


public class Car {

    private int id;
    private CarBrand brand;
    private String model;
    private int yearOfIssue;
    private CarCollor collor;
    private int price;
    private String registratinonNumber;


    public Car() {
    }

    public Car(int id, CarBrand brand, String model, int yearOfIssue, CarCollor collor, int price, String registratinonNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.collor = collor;
        this.price = price;
        this.registratinonNumber = registratinonNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CarBrand getBrand() {
        return brand;
    }

    public void setBrand(CarBrand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public CarCollor getCollor() {
        return collor;
    }

    public void setCollor(CarCollor collor) {
        this.collor = collor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRegistratinonNumber() {
        return registratinonNumber;
    }

    public void setRegistratinonNumber(String registratinonNumber) {
        this.registratinonNumber = registratinonNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", collor=" + collor +
                ", price=" + price +
                ", registratinonNumber='" + registratinonNumber + '\'' +
                '}';
    }
}
