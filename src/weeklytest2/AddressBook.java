package weeklytest2;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts = new ArrayList<>();

    void addContact(Contact contact) {
        contacts.add(contact);
    }

    void displayContacts() {
        if(contacts.isEmpty()) {
            System.out.println("연락처가 비어있습니다.");
            return;
        }

        for(Contact contact : contacts) {
            contact.display();
        }
    }

    void searchContact(String name) {
        for(Contact contact : contacts) {
            if(contact.getName().equals(name)) {
                contact.display();
            }
        }
    }
}
