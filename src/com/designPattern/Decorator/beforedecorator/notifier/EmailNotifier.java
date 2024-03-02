package com.designPattern.Decorator.beforedecorator.notifier;

import com.designPattern.Decorator.beforedecorator.interfaces.Notifier;

public class EmailNotifier implements Notifier {

    @Override
    public void send() {
        System.out.println("이메일 알림 전송");
    }
}
