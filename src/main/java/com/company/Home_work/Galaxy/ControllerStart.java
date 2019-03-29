package com.company.Home_work.Galaxy;


import com.company.Home_work.Galaxy.repository.Planet;
import com.company.Home_work.Galaxy.repository.Satellite;
import com.company.Home_work.Galaxy.repository.Star;
import com.company.Home_work.Galaxy.repository.StarSytem;

public class ControllerStart {

    private View view;

    private StarSytem starSytem;

    public ControllerStart(View view) {
        this.view = view;
        Star star1 = new Star(01L, "Sun");
        Planet earth = new Planet(1L, "earth");
        earth.add(new Satellite(1L, "Satellite"));
        star1.add(earth);
        Planet mars = new Planet(2L, "Mars");
        mars.add(new Satellite(1L, "Fobos"));
        mars.add(new Satellite(2L, "Deimos"));
        star1.add(mars);
        starSytem = new StarSytem(1L, "Milk Way");
        starSytem.add(star1);
    }

    public void run() {
        view.printMessage(view.NAME_STAR, starSytem.listHeavenlybodies().get(0).getName());
        int numberPlanet = starSytem.listHeavenlybodies().get(0).quantityHeavenlyBodiesList();
        view.printMessage(view.NUMBER_PLANETS, Integer.toString(numberPlanet));
        Planet planet = new Planet(3L, "Jupiter");
        planet.add(new Satellite(1, "Metis"));
        planet.add(new Satellite(2, "Adrastea"));
        planet.add(new Satellite(3, "Amalthea"));
        planet.add(new Satellite(4, "Teba"));
        starSytem.listHeavenlybodies().get(0).add(planet);
        numberPlanet = starSytem.listHeavenlybodies().get(0).quantityHeavenlyBodiesList();
        view.printMessage(view.NUMBER_PLANETS, Integer.toString(numberPlanet));
    }

}
