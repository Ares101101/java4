package com.Smarts.SmartDevice;

public abstract class SmartDevice {

    //1. Atributos
    public int id;
    public String model;
    public String fabric;
    public String color;
    public String year;

    //2. Métodos
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    //3. Constructor
    public SmartDevice() {
    }
    public SmartDevice(int id, String model, String fabric, String color, String year) {
        this.id = id;
        this.model = model;
        this.fabric = fabric;
        this.color = color;
        this.year = year;
    }

}
