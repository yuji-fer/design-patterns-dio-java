package me.dio.designpatterns.builder;

public class Computer {
    private final double ram;
    private final int rom;
    private eCabinetType type;

    public Computer(double ram, int rom) {
        this.ram = ram;
        this.rom = rom;
    }

    public double getRam() {
        return ram;
    }

    public int getRom() {
        return rom;
    }

    public eCabinetType getType() {
        return type;
    }

    public void setType(eCabinetType type) {
        this.type = type;
    }

    public String printMessage() {
        return "I don't have a screen yet!";
    }
}
