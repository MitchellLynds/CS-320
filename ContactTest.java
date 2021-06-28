package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import classes.Contact;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("1", "John", "Smith", "2073569896", "135 Mayo Rd Hampden, ME");
		assertTrue(contact.getId().equals("1"));
		assertTrue(contact.getFirstName().equals("John"));
		assertTrue(contact.getLastName().equals("Smith"));
		assertTrue(contact.getPhone().equals("2073569896"));
		assertTrue(contact.getAddress().equals("135 Mayo Rd Hampden, ME"));
	}
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("12345678901", "John", "Smith", "2073569896", "135 Mayo Rd Hampden, ME");
		});	
	}
	@Test
	void testContactIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact(null, "John", "Smith", "2073569896", "135 Mayo Rd Hampden, ME");
		});	
	}
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("1", "John-------", "Smith", "2073569896", "135 Mayo Rd Hampden, ME");
		});	
	}
	@Test
	void testContactFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("1", null, "Smith", "2073569896", "135 Mayo Rd Hampden, ME");
		});	
	}
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("1", "John", "Smith------", "2073569896", "135 Mayo Rd Hampden, ME");
		});	
	}
	@Test
	void testContactLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("1", "John", null, "2073569896", "135 Mayo Rd Hampden, ME");
		});	
	}
	@Test
	void testContactPhoneTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("1", "John", "Smith", "20735698967", "135 Mayo Rd Hampden, ME");
		});	
	}
	@Test
	void testContactPhoneTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("1", "John", "Smith", "207356989", "135 Mayo Rd Hampden, ME");
		});	
	}
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("1", "John", "Smith", "2073569896", "135 Mayo Rd Hampden, ME----------------");
		});	
	}
	@Test
	void testContactPhoneIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("12345678901", "John", "Smith", null, "135 Mayo Rd Hampden, ME");
		});	
	}
	@Test
	void testContactAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("12345678901", "John", "Smith", "2073569896", null);
		});	
	}
}
