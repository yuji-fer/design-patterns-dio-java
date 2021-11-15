package me.dio.designpatterns.decorator;

public class StartMovement implements IMovement {
    @Override
    public void move() {
        System.out.println("Start movement");
    }
}
