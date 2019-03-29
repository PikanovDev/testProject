package com.company.Home_work.Galaxy;

public class View {

    public final String NAME_STAR = "Name star %s";
    public final String NUMBER_PLANETS = "The number of planets is equal to %s!";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessage(String base, String message) {
        printMessage(String.format(base, message));
    }

}
