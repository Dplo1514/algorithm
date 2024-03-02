package com.designPattern.Decorator.afterdecorator.notifier;

import com.designPattern.Decorator.afterdecorator.interfaces.Notifier;

public class SmsNotifier implements Notifier {

    private final Notifier notifier;

    public SmsNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send() {
        notifier.send();
        System.out.println("sms 알림 전송");
    }

}
