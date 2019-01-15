package Chapter8;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contactList;

    public MobilePhone() {
        this.contactList = new ArrayList<>();
    }

    public ArrayList<Contact> getContactList() {
        return contactList;
    }

    public void storeNewContact(String name, String phone) {
        if (query(name) == null) {
            contactList.add(Contact.createContact(name, phone));
        } else {
            System.out.println("Contact name already exists");
        }
    }

    public void search(String name){
        if (query(name) != null) {
            System.out.println("List contains " + name);
        }else {
            System.out.println("Contact not found");
        }
    }

    private Contact query(String name) {
        if (contactList.size() > 0) {
            for (Contact item : contactList) {
                if (item.getName().equals(name)) {
                    return item;
                }
            }
        }
        return null;
    }

    public void remove(String name) {
        remove(query(name));
    }

    private void remove(Contact contact) {
        if (contactList.contains(contact)) {
            contactList.remove(contact);
            System.out.println("Contact removed");
        } else {
            System.out.println("Contact not found");
        }
    }

    public void showContacts() {
        for (Contact i : this.contactList) {
            System.out.println(i.getName() + "  " + i.getPhone());
        }
    }

    public void modifyExistingContact(String searchContactName, String newContactName, String newContactPhone) {
        modifyExistingContact(query(searchContactName), Contact.createContact(newContactName,newContactPhone));
    }

    private void modifyExistingContact(Contact searchContact, Contact newContact) {
        if (contactList.contains(searchContact)) {
            contactList.set(contactList.indexOf(searchContact), newContact);
            System.out.println("Contact updated");
        } else {
            System.out.println("Contact not found");
        }
    }
}
