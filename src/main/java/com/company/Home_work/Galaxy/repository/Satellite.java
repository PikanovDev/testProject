package com.company.Home_work.Galaxy.repository;


public class Satellite extends Base {

    public Satellite() {
        super(Base.Type.SATTELITE);
    }

    public Satellite(long id, String name) {
        this();
        this.setId(id);
        this.setName(name);
    }

}
