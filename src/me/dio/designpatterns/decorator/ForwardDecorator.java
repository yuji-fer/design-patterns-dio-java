package me.dio.designpatterns.decorator;

public class ForwardDecorator extends MovementDecorator {
    public ForwardDecorator(IMovement wrappee) {
        super(wrappee);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Move forward");
    }
}
