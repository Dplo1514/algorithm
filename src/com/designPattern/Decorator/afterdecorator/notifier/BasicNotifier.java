package com.designPattern.Decorator.afterdecorator.notifier;

import com.designPattern.Decorator.afterdecorator.interfaces.Notifier;

public class BasicNotifier implements Notifier {

    @Override
    public void send() {
        System.out.println("기본 알림 전송");
    }

}
