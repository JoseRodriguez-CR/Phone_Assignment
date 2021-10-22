package com.codingdojo.classes;

import com.codingdojo.abstractclasses.Phone;
import com.codingdojo.interfaces.Ringable;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    /*
    @Override
    public void ring() {
        this.getRingTone();
    }
    */
    @Override 
    public void ring() {
    	String ringTone = getRingTone();
    	System.out.println("Your IPhone is ringing: " + ringTone);
    }
    
    @Override
    public void unlock() {
        System.out.println("Your IPhone has been unlock, welcome");
    }
    @Override
    public void displayInfo() {
    	System.out.println("Your IPhone's batery percentage is: " + this.getBatteryPercentage());   
    	System.out.println("Your IPhone's company carrier is: " + this.getCarrier());
    	System.out.println("Your IPhone's model is: " + this.getVersionNumber());
    }
}