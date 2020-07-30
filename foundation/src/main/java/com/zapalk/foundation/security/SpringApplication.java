package com.zapalk.foundation.security;

import com.zapalk.foundation.PropertySlurper;
import com.zapalk.foundation.data.Person;

public class SpringApplication {
    public static void main(String[] args) {
        Person p = new Person("sa","sa","sa");
        System.out.println(p.toString());
        System.out.println(PropertySlurper.getPerson());
    }
}
