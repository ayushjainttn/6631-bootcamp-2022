package com.ayushjainttn.restfulwebservices2.internationalization.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class InternationalizationController {
    @Autowired
    private MessageSource messageSource;

    @GetMapping(path = "/{userName}")
    public String internationalizationGetController(@PathVariable String userName){
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("hello.message", new String[]{userName.toUpperCase(locale)},"Hello User",locale);
    }
}
