package me.dio.designpatterns;

import me.dio.designpatterns.builder.ComputerBuilder;
import me.dio.designpatterns.builder.Director;
import me.dio.designpatterns.builder.SmartphoneBuilder;
import me.dio.designpatterns.decorator.*;
import me.dio.designpatterns.builder.Computer;
import me.dio.designpatterns.builder.Smartphone;
import me.dio.designpatterns.observer.EmailNotificationListener;
import me.dio.designpatterns.observer.IProductListener;
import me.dio.designpatterns.observer.ProductManager;
import me.dio.designpatterns.observer.WhatsAppNotificationListener;

public class Test {
    public static void main(String[] args) {
        // Builder
        Director director = new Director();
        ComputerBuilder computerBuilder = new ComputerBuilder();
        SmartphoneBuilder smartphoneBuilder = new SmartphoneBuilder();

        director.makeBasicComputer(computerBuilder);
        Computer computer = computerBuilder.build();
        System.out.println(computer.printMessage());

        director.makeSmartphoneGamer(smartphoneBuilder);
        Smartphone smartphone = smartphoneBuilder.build();
        System.out.println(smartphone.toString());

        // Decorator
        StartMovement s = new StartMovement();
        ForwardDecorator a = new ForwardDecorator(s);
        LeftDecorator l = new LeftDecorator(a);
        RightDecorator r = new RightDecorator(l);
        BackwardDecorator b = new BackwardDecorator(r);
        b.move();

        // Observer
        ProductManager manager = new ProductManager();
        IProductListener emailListener = new EmailNotificationListener("test@test.com");
        manager.subscribe(emailListener);
        manager.subscribe(new WhatsAppNotificationListener("9999-9999"));
        manager.notify("Your product 1 arrived here!");
        manager.unsubscribe(emailListener);
        manager.notify("50% OFF on Product 2.");
    }
}
