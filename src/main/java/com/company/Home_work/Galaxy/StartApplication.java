package com.company.Home_work.Galaxy;

public class StartApplication {
    public static void main(String[] args) {
        View view = new View();
        ControllerStar controller = new ControllerStar(view);
        controller.run();
    }

}
