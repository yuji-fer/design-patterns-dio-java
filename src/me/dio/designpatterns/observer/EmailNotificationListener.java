package me.dio.designpatterns.observer;

public class EmailNotificationListener implements IProductListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String message) {
        System.out.println(message + " This email has sent to " +
            email + " as a part of your subscription.");
    }
}
