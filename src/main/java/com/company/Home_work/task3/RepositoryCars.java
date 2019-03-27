package com.company.Home_work.task3;

public class RepositoryCars {

    private Car[] cars;

    {
        cars = new Car[10];
        cars[0] = new Car(1, CarBrand.Nissan, "Tiida", 2008, CarCollor.BLACK, 6_000, "AA1768TE");
        cars[1] = new Car(2, CarBrand.Toyota, "Auris", 20009, CarCollor.GREY, 6_500, "AA1111TO");
        cars[2] = new Car(3, CarBrand.Volkswagen, "Golf", 2012, CarCollor.BLUE, 10_000, "AA2222TE");
        cars[3] = new Car(4, CarBrand.Cadillac, "Escalade", 2018, CarCollor.BLACK, 20_000, "AA3333TE");
        cars[4] = new Car(5, CarBrand.Audi, "A3", 2013, CarCollor.BLACK, 12_000, "AA2520TE");
        cars[5] = new Car(6, CarBrand.Chevrolet, "Camaro", 2019, CarCollor.YELLOW, 60_000, "AA1563TE");
        cars[6] = new Car(7, CarBrand.Mercedes, "W222", 2018, CarCollor.GREY, 120_000, "AA10101TE");
        cars[7] = new Car(8, CarBrand.Dodge, "Charger", 2018, CarCollor.RED, 80_000, "AA8888TE");
        cars[8] = new Car(9, CarBrand.Nissan, "Primera", 2014, CarCollor.BLACK, 15_000, "AA0305TE");
        cars[9] = new Car(10, CarBrand.Nissan, "Qushqai", 2016, CarCollor.BROWN, 21_000, "AA7777TE");

    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

}
