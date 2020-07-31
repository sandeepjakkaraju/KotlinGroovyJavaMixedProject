package com.zapalk.foundation.security;

import com.zapalk.foundation.PropertySlurper;
import com.zapalk.foundation.data.CommonUtilsKt;
import com.zapalk.foundation.data.Person;
import com.zapalk.foundation.data.TestKt;

public class SpringApplication {
    public static void main(String[] args) {

        // Using Kotlin Data CLass in Java Class.
        Person p = new Person("sa", "sa", "sa");
        System.out.println(p.toString());

        // Using Groovy class in the Java Class.
        System.out.println(PropertySlurper.getPerson());

        // Using a Kotlin Class in the Java Class.
        System.out.println(CommonUtilsKt.stringSuffixer("Sandeep"));

        // Calling a Kotlin method from a Java Class.
        TestKt.test();
    }
}
