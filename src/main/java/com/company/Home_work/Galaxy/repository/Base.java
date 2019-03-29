package com.company.Home_work.Galaxy.repository;

public abstract class Base {

    private long id;

    private String name;

    private Base.Type type;

    public Base(Base.Type type) {
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Base.Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Base [id=" + id + ", name=" + name + ", type=" + type + "]";
    }

    enum Type {
        SATTELITE,
        PLANET,
        STAR,
        STARSYSTEM
    }

}
