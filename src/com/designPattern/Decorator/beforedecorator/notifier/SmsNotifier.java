package com.designPattern.Decorator.beforedecorator.notifier;

import com.designPattern.Decorator.beforedecorator.interfaces.Notifier;

public class SmsNotifier implements Notifier {

    @Override
    public void send() {
        System.out.println("문자 알림 전송");
    }
}
