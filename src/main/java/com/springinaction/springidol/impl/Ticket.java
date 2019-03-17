package com.springinaction.springidol.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Ticket {

    @Autowired
    Environment env;

    @Value("${some.key}")
    private String owner;

    private String cat;

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getOwner() {
        return owner;
    }
}
