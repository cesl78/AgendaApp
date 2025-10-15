package org.ulpgc.is1.model;

import java.util.List;

public abstract class Contact {
    String telephone;
    String email;
    Address address;

    private List<Group> groupList;

    public Contact(String telephone, String email) {
        this.telephone = telephone;
        this.email = email;
    }

    public String getName(String name){
        return name;
    }

    public void setAddress(String street, int number, int floor, String city) {
        this.address = new Address(street, number, floor, city);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public  String getTelephone() {
        return telephone;
    }
    public String getEmail() {
        return email;
    }

    abstract public getName() {}

}
