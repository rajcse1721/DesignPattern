package org.project.solidPrinciple.DIP.GoodCode;

public class main {
    public static void main(String[] args) {
        NotificationService email = new NotificationService(new EmailService());
        email.notify("Your order has been shiped to your location");

        NotificationService sms = new NotificationService(new SmsService());
        sms.notify("your otp is 12345");
    }
}
