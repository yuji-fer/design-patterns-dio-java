package me.dio.designpatterns.builder;

public class SmartphoneBuilder implements Builder {
    private double ram;
    private int rom;

    @Override
    public void setRam(double ram) {
        this.ram = ram;
    }

    @Override
    public void setRom(int rom) {
        this.rom = rom;
    }

    public Smartphone build() {
        return new Smartphone(ram, rom);
    }
}
