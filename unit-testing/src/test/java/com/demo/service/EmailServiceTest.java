package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Matchers.anyBoolean;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {

    @InjectMocks
    EmailService emailService;

    @Mock
    Order order;
    @Test(expected = RuntimeException.class)
    public void testSendEmailFalse(){
        emailService.sendEmail(order);
        doThrow(RuntimeException.class).when(order).setCustomerNotified(false);
    }

    @Test
    public void testSendEmailTrue(){
        //when
        boolean result = emailService.sendEmail(order, "send email to ayush");
        //then
        //then(order).should(times(1)).setCustomerNotified(true);
        //verify
        verify(order, times(1)).setCustomerNotified(true);
        assertTrue(result);

    }
}