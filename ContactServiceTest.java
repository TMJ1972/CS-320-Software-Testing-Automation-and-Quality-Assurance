package com.snhu.contacts;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

    @Test
    void addContactStoresByUniqueID() {
        ContactService svc = new ContactService();
        Contact c1 = new Contact("1", "John", "Smith", "1234567890", "1 First St");
        svc.addContact(c1);
        assertEquals(1, svc.size());
        assertSame(c1, svc.getContact("1"));
    }

    @Test
    void addDuplicateIDThrows() {
        ContactService svc = new ContactService();
        Contact c1 = new Contact("1", "A", "B", "1234567890", "X");
        Contact c2 = new Contact("1", "C", "D", "1234567890", "Y");
        svc.addContact(c1);
        assertThrows(IllegalArgumentException.class, () -> svc.addContact(c2));
    }

    @Test
    void deleteContactRemovesByID() {
        ContactService svc = new ContactService();
        Contact c1 = new Contact("1", "John", "Smith", "1234567890", "1 First St");
        svc.addContact(c1);
        svc.deleteContact("1");
        assertNull(svc.getContact("1"));
        assertEquals(0, svc.size());
    }

    @Test
    void deleteMissingContactThrows() {
        ContactService svc = new ContactService();
        assertThrows(IllegalArgumentException.class, () -> svc.deleteContact("missing"));
    }

    @Test
    void updateContactFieldsByID() {
        ContactService svc = new ContactService();
        Contact c1 = new Contact("1", "John", "Smith", "1234567890", "1 First St");
        svc.addContact(c1);

        svc.updateContact("1", "Jane", "Doe", "0987654321", "2 Second St");

        Contact updated = svc.getContact("1");
        assertEquals("Jane", updated.getFirstName());
        assertEquals("Doe", updated.getLastName());
        assertEquals("0987654321", updated.getPhone());
        assertEquals("2 Second St", updated.getAddress());
    }

    @Test
    void updateMissingContactThrows() {
        ContactService svc = new ContactService();
        assertThrows(IllegalArgumentException.class,
                () -> svc.updateContact("missing", "A", "B", "1234567890", "Addr"));
    }
    
    @Test
    void addNullContactThrows() {
    	ContactService svc = new ContactService();
    	assertThrows(IllegalArgumentException.class, () -> svc.addContact(null));
    }
    
    @Test
    void updateOnlyAddressLeavesOtherFieldsUnchanged() {
        ContactService svc = new ContactService();
        Contact c1 = new Contact("1", "John", "Smith", "1234567890", "1 First St");
        svc.addContact(c1);

        svc.updateContact("1", null, null, null, "New Address");

        Contact updated = svc.getContact("1");
        assertEquals("John", updated.getFirstName());
        assertEquals("Smith", updated.getLastName());
        assertEquals("1234567890", updated.getPhone());
        assertEquals("New Address", updated.getAddress());
    }
}
