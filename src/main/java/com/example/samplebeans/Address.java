package com.example.samplebeans;
import org.springframework.stereotype.Component;

@Component
public class Address {
    private String streetAddress;

    public Address(String streetAddress){
        this.streetAddress = streetAddress;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
}
