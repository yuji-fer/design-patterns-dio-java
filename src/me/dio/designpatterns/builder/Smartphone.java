package me.dio.designpatterns.builder;

public class Smartphone {
    private final double ram;
    private final int rom;
    private eScreenType type;

    public Smartphone(double ram, int rom) {
        this.ram = ram;
        this.rom = rom;
    }

    public double getRam() {
        return ram;
    }

    public int getRom() {
        return rom;
    }

    public eScreenType getType() {
        return type;
    }

    public void setType(eScreenType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "ram=" + ram +
                ", rom=" + rom +
                ", type=" + type +
                '}';
    }
}
