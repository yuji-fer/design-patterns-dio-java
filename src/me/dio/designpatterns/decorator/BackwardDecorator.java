package me.dio.designpatterns.decorator;

public class BackwardDecorator extends MovementDecorator {
    public BackwardDecorator(IMovement wrappee) {
        super(wrappee);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Move backward");
    }
}
