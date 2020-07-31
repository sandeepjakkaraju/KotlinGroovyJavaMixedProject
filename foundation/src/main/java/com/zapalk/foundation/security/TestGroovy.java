package com.zapalk.foundation.security;

import com.zapalk.foundation.*;
import com.zapalk.foundation.data.Person;


public class TestGroovy {
    public static String getSurlper(){
        // Using a Groovy class in the Java Class.
        return PropertySlurper.getPerson();
    }
}
