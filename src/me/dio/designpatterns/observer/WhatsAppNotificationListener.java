package me.dio.designpatterns.observer;

public class WhatsAppNotificationListener implements IProductListener {
    private String number;

    public WhatsAppNotificationListener(String number) {
        this.number = number;
    }

    @Override
    public void update(String message) {
        System.out.println(message + " This notification has sent to " +
                number + " as a part of your subscription.");
    }
}
