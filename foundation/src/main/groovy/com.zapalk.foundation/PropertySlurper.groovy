package com.zapalk.foundation

import com.zapalk.foundation.data.CommonUtilsKt
import com.zapalk.foundation.data.Person

public class PropertySlurper {

    static void main(String[] args) {
        println "HELLO Sandeep"
        Person person = new Person("sandeep", "kumar", "sand@g.com")
        println(person.toString())
        println(CommonUtilsKt.stringSuffixer("eacher"))
    }

    static String getPerson(){
        Person person = new Person("sandeep", "kumar", "sand@g.com")
        return person
    }

}
