package com.codingdojo.abstractclasses;

public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    
    // class constructor
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    // abstract method. This method will be implemented by the subclasses
    public abstract void displayInfo();
    public abstract void ring();
    public abstract void unlock();
    
    
	// getters and setters for Phone attributes
    
    // shows ring tone  given when instantiate the class
	public String getRingTone() {
		return this.ringTone;
	}
	// allows the user change the ring tone
	/*public void setRingTone(String ringTone) {
		this.ringTone = ringTone;
	}*/
	
	// shows battery percentage given when instantiate the class
	public int getBatteryPercentage() {
		return batteryPercentage;
	}
	// allows the user charge the battery 
	/*public void setBatteryPercentage(int batteryPercentage) {
		this.batteryPercentage = batteryPercentage;
	}*/
	
	// shows company carrier given when instantiate the class
	public String getCarrier() {
		return carrier;
	}
	/*
	// allows the user change the company carrier 
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}*/
	
	// shows model given when instantiate the class, 
	//no setter was added for this since you cannot change the model of phone after you buy it
	public String getVersionNumber() {
		return versionNumber;
	}
    
}