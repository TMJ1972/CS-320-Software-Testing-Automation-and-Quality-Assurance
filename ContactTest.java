package com.snhu.contacts;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ContactTest {

    @Test
    void validContactIsCreated() {
        Contact c = new Contact("A123456789", "John", "Doe", "1234567890", "123 Main Street");
        assertEquals("A123456789", c.getContactID());
        assertEquals("John", c.getFirstName());
        assertEquals("Doe", c.getLastName());
        assertEquals("1234567890", c.getPhone());
        assertEquals("123 Main Street", c.getAddress());
    }

    @Test
    void contactIDTooLongThrows() {
        assertThrows(IllegalArgumentException.class,
            () -> new Contact("TOO_LONG_ID_11", "John", "Doe", "1234567890", "123 Main Street"));
    }

    @Test
    void firstNameNullThrows() {
        assertThrows(IllegalArgumentException.class,
            () -> new Contact("ID1", null, "Doe", "1234567890", "123 Main Street"));
    }

    @Test
    void lastNameTooLongThrows() {
        assertThrows(IllegalArgumentException.class,
            () -> new Contact("ID1", "John", "ABCDEFGHIJKLMNOP", "1234567890", "123 Main Street"));
    }

    @Test
    void phoneMustBeExactly10Digits() {
        assertThrows(IllegalArgumentException.class,
            () -> new Contact("ID1", "John", "Doe", "12345", "123 Main Street"));
        assertThrows(IllegalArgumentException.class,
            () -> new Contact("ID1", "John", "Doe", "123456789A", "123 Main Street"));
    }

    @Test
    void addressTooLongThrows() {
        String longAddress = "1234567890123456789012345678901"; // 31 chars
        assertThrows(IllegalArgumentException.class,
            () -> new Contact("ID1", "John", "Doe", "1234567890", longAddress));
    }

    @Test
    void contactIDIsNotUpdatable() {
        Contact c = new Contact("CONSTID", "John", "Doe", "1234567890", "123 Main Street");
        // No setter exists; just confirm it returns the same
        assertEquals("CONSTID", c.getContactID());
    }

    @Test
    void settersValidateInput() {
        Contact c = new Contact("ID1", "John", "Doe", "1234567890", "123 Main Street");
        assertThrows(IllegalArgumentException.class, () -> c.setFirstName(null));
        assertThrows(IllegalArgumentException.class, () -> c.setLastName("TOO_LONG_NAME"));
        assertThrows(IllegalArgumentException.class, () -> c.setPhone("bad"));
        assertThrows(IllegalArgumentException.class, () -> c.setAddress(null));
    }
}
