package me.dio.designpatterns.decorator;

public class MovementDecorator implements IMovement {
    private IMovement wrappee;

    public MovementDecorator(IMovement wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void move() {
        wrappee.move();
    }
}
