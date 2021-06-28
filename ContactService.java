package classes;
import java.util.ArrayList; // import the ArrayList class
import java.util.List;

public class ContactService {
	private List<Contact> contactsList;
	
	public ContactService() {
		contactsList = new ArrayList<Contact>();
	}
	
	public void addContact(String id, String firstName, String lastName, String phone, String address) {
			for (Contact existingContact : contactsList) {
	           if (existingContact.getId().equals(id)) {
	        	   throw new IllegalArgumentException("Invalid id");
	           }
			}
		   Contact contact = new Contact(id, firstName, lastName, phone, address);
	       contactsList.add(contact);
	}
	
	 public Contact deleteContact(String searchId) {
	       for (Contact contact : contactsList) {
	           if (contact.getId().equals(searchId)) {
	               contactsList.remove(contact);
	               return contact;
	           }
	       }
	       return null;
	   }
	  
	public static void main(String[] args) {
	       
	}
}
