package com.designPattern.Decorator.afterdecorator;

import com.designPattern.Decorator.afterdecorator.notifier.BasicNotifier;
import com.designPattern.Decorator.afterdecorator.notifier.EmailNotifier;
import com.designPattern.Decorator.afterdecorator.interfaces.Notifier;
import com.designPattern.Decorator.afterdecorator.notifier.SmsNotifier;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        /*
         * 기본 알림 전송 시나리오
             * 1. 기본 알림을 전송한다.
         */
        Notifier basicNotifier = new BasicNotifier();
        basicNotifier.send();
        System.out.print("\n");

        /*
         * Email 알림 전송 시나리오
             * 1. 기본 알림을 전송한다.
             * 2. 이메일 알림을 전송한다.
         */
        Notifier emailNotifier = new EmailNotifier(new BasicNotifier());
        emailNotifier.send();
        System.out.print("\n");

        /*
         * Sms 알림 전송 시나리오
             * 1. 기본 알림을 전송한다.
             * 2. 이메일 알림을 전송한다.
             * 3. Sms 알림을 전송한다.
         */
        Notifier smsNotifier = new SmsNotifier(new EmailNotifier(new BasicNotifier()));
        smsNotifier.send();
        System.out.print("\n");
    }

}
