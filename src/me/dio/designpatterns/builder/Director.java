package me.dio.designpatterns.builder;

public class Director {
    public void makeBasicComputer(Builder builder) {
        builder.setRam(1.5D);
        builder.setRom(160);
    }

    public void makeSmartphoneGamer(Builder builder) {
        builder.setRam(8);
        builder.setRom(500);
    }
}
