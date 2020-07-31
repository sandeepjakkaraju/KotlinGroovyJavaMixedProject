package com.zapalk.foundation.security;

public class Professor {
    private String name="SAndeep";
    private String designation = "Proferssor";

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

}
