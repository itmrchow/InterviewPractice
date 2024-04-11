package com.designpatten.bridge;

import com.designpatten.bridge.devices.Device;
import com.designpatten.bridge.devices.Radio;
import com.designpatten.bridge.devices.Tv;
import com.designpatten.bridge.remotes.AdvancedRemote;
import com.designpatten.bridge.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    private static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        var basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        var advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
