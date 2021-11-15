package me.dio.designpatterns.decorator;

public class LeftDecorator extends MovementDecorator {
    public LeftDecorator(IMovement wrappee) {
        super(wrappee);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Move left");
    }
}
