package com.company.Home_work.Galaxy.repository;

import java.util.ArrayList;
import java.util.List;

public class StarSytem extends Base implements BasicDescriptionSpaceBody<Star> {

    private List<Star> starts = new ArrayList<Star>();

    public StarSytem() {
        super(Base.Type.STARSYSTEM);
    }

    public StarSytem(long id, String name) {
        this();
        setId(id);
        setName(name);
    }

    public void add(Star heavenlyBody) {
        this.starts.add(heavenlyBody);
    }

    public List<Star> listHeavenlybodies() {
        return this.starts;
    }

    public int quantityHeavenlyBodiesList() {
        return starts.size();
    }

}
