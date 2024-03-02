package com.designPattern.Decorator.afterdecorator.notifier;

import com.designPattern.Decorator.afterdecorator.interfaces.Notifier;

public class EmailNotifier implements Notifier {

    private final Notifier notifier;

    public EmailNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send() {
        notifier.send();
        System.out.println("이메일 알림 전송");
    }
}
