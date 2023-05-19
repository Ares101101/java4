package com.Smarts.SmartDevice.SmartPhone;

import com.Smarts.SmartDevice.SmartDevice;

public class SmartPhone extends SmartDevice {

        //1. Atributos
        String cameraMP;
        boolean lapizTactil;

        //2. Constructor
        public SmartPhone() {
        }
        public SmartPhone(int id, String model, String fabric, String color, String year, String cameraMP, boolean lapizTactil) {
                super(id, model, fabric, color, year);
                this.cameraMP = cameraMP;
                this.lapizTactil = lapizTactil;
        }
}
