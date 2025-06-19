package org.project.solidPrinciple.DIP.BadCode;

public class main {
    public static void main(String[] args) {
        NoticationService noticationService = new NoticationService();
        noticationService.notifyByEmail("your parcel is in transt");
        noticationService.notifyBySms("your otp is 12cdfe");
    }
}
