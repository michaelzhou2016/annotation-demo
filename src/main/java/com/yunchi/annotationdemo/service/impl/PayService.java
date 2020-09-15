package com.yunchi.annotationdemo.service.impl;

import com.yunchi.annotationdemo.anotation.PayHandlerType;
import com.yunchi.annotationdemo.service.PayHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class PayService {
    private Map<String, PayHandler> payHandlerMap;

    @Autowired
    public void setPayHandlerMap(List<PayHandler> payHandlers) {
        // 注入各种类型的支付处理类
        payHandlerMap = payHandlers.stream().collect(
                Collectors.toMap(orderHandler -> AnnotationUtils.findAnnotation(orderHandler.getClass(), PayHandlerType.class).type(),
                        v -> v, (v1, v2) -> v1));
        payHandlerMap.entrySet().stream().forEach(e -> {
            System.out.println(e.getKey() + ":" + e.getValue());
        });
    }
}
