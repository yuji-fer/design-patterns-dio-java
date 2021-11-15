package me.dio.designpatterns.builder;

public class ComputerBuilder implements Builder {
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

    public Computer build() {
        return new Computer(ram, rom);
    }
}
