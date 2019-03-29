package com.company.Home_work.Galaxy.repository;

import java.util.ArrayList;
import java.util.List;

public class Planet extends Base implements BasicDescriptionSpaceBody<Satellite> {

    private List<Satellite> luns = new ArrayList<Satellite>();

    public Planet() {
        super(Base.Type.PLANET);
    }

    public Planet(long id, String name) {
        this();
        setId(id);
        setName(name);
    }

    public void add(Satellite heavenlyBody) {
        luns.add(heavenlyBody);
    }

    public List<Satellite> listHeavenlybodies() {
        return luns;
    }

    public int quantityHeavenlyBodiesList() {
        return luns.size();
    }

}
