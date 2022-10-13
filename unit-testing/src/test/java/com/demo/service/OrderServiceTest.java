package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
@RunWith(MockitoJUnitRunner.class)
public class OrderServiceTest {
    @InjectMocks
    OrderService orderService;

    @Mock
    EmailService emailService;
    @Mock
    Order order;

    @Test
    public void testPlaceOrderVoid(){
        given(order.getPrice()).willReturn(100.0);
        orderService.placeOrder(order);
        verify(order).setPriceWithTax(20.0);
        verify(emailService).sendEmail(order);
        verify(order).setCustomerNotified(true);
    }

    @Test
    public void testPlaceOrderBoolean(){
        given(order.getPrice()).willReturn(200.0);
        given(emailService.sendEmail(order, "this is string2")).willReturn(true);
        boolean result = orderService.placeOrder(order,"this is string");
        verify(order).setPriceWithTax(40.0);
        verify(order).setCustomerNotified(result);
        assertFalse(result);
    }
}
