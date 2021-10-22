package com.codingdojo.classes;

public class PhoneTester {
    public static void main(String[] args) {
        Galaxy galaxyNote10 = new Galaxy("GalaxyNote10", 100, "Verizon","RING RING RING");
        IPhone iPhone7 = new IPhone("7", 100, "KOLBI", "Bit-bit Bit-bit");
        

        galaxyNote10.ring();
        galaxyNote10.unlock();
        galaxyNote10.displayInfo();
        System.out.println("");
        
        iPhone7.ring();
        iPhone7.unlock();
        iPhone7.displayInfo();
        System.out.println("");
    }
}