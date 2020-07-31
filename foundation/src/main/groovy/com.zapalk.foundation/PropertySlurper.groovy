package com.zapalk.foundation

import com.zapalk.foundation.data.CommonUtilsKt
import com.zapalk.foundation.data.Person
import com.zapalk.foundation.security.Professor

public class PropertySlurper {

    static void main(String[] args) {
        println "HELLO Sandeep"

        // Using Kotlin data class in Groovy class.
        Person person = new Person("sandeep", "kumar", "sand@g.com")
        println(person.toString())

        // Using Kotlin utility class in Groovy class.
        println(CommonUtilsKt.stringSuffixer("eacher"))

        // Using a Java Class in Groovy
        Professor professor = new Professor()
        professor.designation = "AAP"
        professor.name= "Tamesh"

        println(professor.toString())

    }

    static String getPerson(){
        // Using kotlin data class.
        Person person = new Person("sandeep", "kumar", "sand@g.com")
        return person
    }

}
