package com.Smarts.main;

import com.Smarts.SmartDevice.SmartPhone.SmartPhone;
import com.Smarts.SmartDevice.SmartWatch.SmartWatch;

public class Main {
    public static void main(String[] args) {

        SmartPhone xiaomi = new SmartPhone(12,"s11","xiaomi","azul","2020","40",false);

        SmartPhone iphone = new SmartPhone();
        iphone.year = "2022";
        System.out.println(iphone.year);

        SmartWatch xiaomiS3 = new SmartWatch(12,"s11","xiaomi","azul","2020","cuero negro");
        System.out.println(xiaomiS3.model);
    }
}
