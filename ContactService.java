package com.snhu.contacts;

import java.util.HashMap;
import java.util.Map;

public class ContactService {

    private final Map<String, Contact> contacts = new HashMap<>();

    // Adds a contact with a unique ID
    public void addContact(Contact contact) {
        if (contact == null) {
            throw new IllegalArgumentException("Contact cannot be null");
        }
        String id = contact.getContactID();
        if (id == null || contacts.containsKey(id)) {
            throw new IllegalArgumentException("Duplicate or invalid contact ID");
        }
        contacts.put(id, contact);
    }

    // Deletes a contact by ID
    public void deleteContact(String contactID) {
        if (contactID == null || !contacts.containsKey(contactID)) {
            throw new IllegalArgumentException("Contact not found");
        }
        contacts.remove(contactID);
    }

    // Updates contact fields by ID (firstName, lastName, Number/phone, address)
    public void updateContact(String contactID, String firstName, String lastName, String phone, String address) {
        Contact c = contacts.get(contactID);
        if (c == null) {
            throw new IllegalArgumentException("Contact not found");
        }
        if (firstName != null && !firstName.isEmpty()) c.setFirstName(firstName);
        if (lastName  != null && !lastName.isEmpty())  c.setLastName(lastName);
        if (phone     != null && !phone.isEmpty())     c.setPhone(phone);
        if (address   != null && !address.isEmpty())   c.setAddress(address);
    }

    // Helper for tests
    public Contact getContact(String contactID) {
        return contacts.get(contactID);
    }

    public int size() {
        return contacts.size();
    }
}
