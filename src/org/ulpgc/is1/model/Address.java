package org.ulpgc.is1.model;

public class Address {
    String city;
    String street;
    int Number;
    int floor;

    public Address(String street, int number, int floor, String city) {
        this.city = city;
        this.street = street;
        this.Number = number;
        this.floor = floor;
    }
}
