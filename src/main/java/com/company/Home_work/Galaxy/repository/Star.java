package com.company.Home_work.Galaxy.repository;

import java.util.ArrayList;
import java.util.List;

public class Star extends Base implements BasicDescriptionSpaceBody<Planet> {

    private List<Planet> planets = new ArrayList<Planet>();

    public Star() {
        super(Base.Type.STAR);
    }

    public Star(long id, String name) {
        this();
        setId(id);
        setName(name);
    }

    public void add(Planet heavenlyBody) {
        planets.add(heavenlyBody);
    }

    public int quantityHeavenlyBodiesList() {
        return planets.size();
    }

    public List<Planet> listHeavenlybodies() {
        return planets;
    }
}
