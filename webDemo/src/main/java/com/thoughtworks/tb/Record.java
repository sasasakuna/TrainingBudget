package com.thoughtworks.tb;

/**
 * Created by hjli on 7/17/14.
 */
public class Record {

    private String id;
    private String name;
    private String type;
    private String cost;

    public Record(String id, String name, String type, String cost) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.cost = cost;
    }

    public String getId() {
        return id;

    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
