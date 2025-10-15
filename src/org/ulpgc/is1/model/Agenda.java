package org.ulpgc.is1.model;
import java.util.ArrayList;
import java.util.List;


public class Agenda {
    private List<Group> groups;
    private List<Contact> contacts;

    public Agenda() {
        groups = new ArrayList<>();
        contacts = new ArrayList<>();
    }

    public void addPerson(String firstName, String lastName, String phone, String email, String street, int number, int floor, String city){
        contacts.add(new Person(firstName, lastName, phone, email, street, number, floor, city));
    }


    public void addCompany(String name, String description) {
        Company company = new Company(name, description);
        companies.add(company);
    }
}
