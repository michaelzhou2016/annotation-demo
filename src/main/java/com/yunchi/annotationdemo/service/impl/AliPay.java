package com.yunchi.annotationdemo.service.impl;

import com.yunchi.annotationdemo.anotation.PayHandlerType;
import com.yunchi.annotationdemo.service.PayHandler;

@PayHandlerType(type = "AliPay")
public class AliPay implements PayHandler {
    @Override
    public void pay(String order) {

    }
}
