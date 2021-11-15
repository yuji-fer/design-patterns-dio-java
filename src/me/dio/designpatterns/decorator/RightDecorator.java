package me.dio.designpatterns.decorator;

public class RightDecorator extends MovementDecorator {
    public RightDecorator(IMovement wrappee) {
        super(wrappee);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Move right");
    }
}
