package com.designPattern.Decorator.beforedecorator.notifier;

import com.designPattern.Decorator.beforedecorator.interfaces.Notifier;

public class BasicNotifier implements Notifier {

    @Override
    public void send() {
        System.out.println("기본 알림 전송");
    }
}
