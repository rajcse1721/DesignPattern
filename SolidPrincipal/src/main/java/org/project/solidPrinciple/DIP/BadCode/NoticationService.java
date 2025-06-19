package org.project.solidPrinciple.DIP.BadCode;

public class NoticationService {
    private EmailService emailService;
    private SmsService smsService;

    public NoticationService(){
        this.emailService = new EmailService();
        this.smsService = new SmsService();
    }
    public void notifyByEmail(String msg){
        emailService.sendEmail(msg);
    }
    public void notifyBySms(String msg){
        smsService.sendSms(msg);
    }
}
