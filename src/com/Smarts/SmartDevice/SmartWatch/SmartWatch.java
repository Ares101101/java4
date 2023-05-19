package com.Smarts.SmartDevice.SmartWatch;

import com.Smarts.SmartDevice.SmartDevice;

public class SmartWatch extends SmartDevice {

    String correa;

    public SmartWatch() {
    }
    public SmartWatch(int id, String model, String fabric, String color, String year, String correa) {
        super(id, model, fabric, color, year);
        this.correa = correa;
    }
}
