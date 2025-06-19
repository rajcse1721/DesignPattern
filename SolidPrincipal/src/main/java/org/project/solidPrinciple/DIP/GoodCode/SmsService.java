package org.project.solidPrinciple.DIP.GoodCode;

public class SmsService implements NotificationChannel{
    @Override
    public void send(String msg) {
        System.out.println("Sending Sms : " + msg);
    }
}
