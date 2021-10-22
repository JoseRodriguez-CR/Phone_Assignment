package com.codingdojo.classes;

import com.codingdojo.abstractclasses.Phone;
import com.codingdojo.interfaces.Ringable;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public void ring() {
    	//this.getRingTone();
    	System.out.println("Your Galaxy Note 10 is ringing: " + this.getRingTone());
    }
    
    @Override
    public void unlock() {
    	System.out.println("Your Galaxy Note 10 has been unlock, welcome");
    }
    
    @Override
    public void displayInfo() {
    	System.out.println("Your Galaxy's batery percentage is: " + this.getBatteryPercentage());   
    	System.out.println("Your Galaxy's company carrier is: " + this.getCarrier());
    	System.out.println("Your Galaxy's model is: " + this.getVersionNumber());         
    }
}
