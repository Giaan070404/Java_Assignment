package vti.com;

import vti.com.Contact;
import vti.com.Phone;

import java.util.ArrayList;
import java.util.List;

public class Vietnamese extends Phone {
    public List<Contact> contacts;
    public Vietnamese(){
        this.contacts = new ArrayList<>();
    }
    @Override
    public void insertContact(String name, String phone) {
        Contact contact = new Contact();
        contact.setName(name);
        contact.setPhoneNumber(phone);
        this.contacts.add(contact);
    }

    @Override
    public void removeContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                contacts.remove(contact);
            }
        }
    }

    @Override
    public void updateContact(String oldName, String newName) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(oldName)) {
                contact.setName(newName);
            }
        }
    }

    @Override
    public String searchContact(String name) {
        for (Contact contact : contacts){
            if (contact.getName().equals(name)) {
                return contact.getPhoneNumber();
            }
        }
        return " ";
    }
}
