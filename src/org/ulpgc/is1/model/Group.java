package org.ulpgc.is1.model;

import java.util.List;

public class Group {
    final String name;

    private List<Contact> contactList;

    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addContact(Contact contact) {
        contactList.add(contact);
    }

    public void removeContact(Contact contact) {
        contactList.remove(contact);
    }
}
