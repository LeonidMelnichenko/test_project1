/*
package src.lesson200223.Contacts;


import src.lesson200223.exeptions.AddContectExeption;
import src.lesson200223.exeptions.ChangeContactExeption;
import src.lesson200223.exeptions.FavoriteContactExeption;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, Contact> contacts;
    private Map<Integer, FavoriteContact> favoriteContacts = new HashMap<>();

    public PhoneBook(Map<String, Contact> contacts) {
        this.contacts = contacts;
    }

    public Contact addContact(Contact contact) {
        if (contact == null) {
            throw new AddContectExeption("Contact is null");
        }
        if (contacts.containsKey(contact.getName())) {
            throw new AddContectExeption(
                    "Contact whith name" + contact.getName() + "already exists"
            );
        }

        return contacts.put(contact.getName(), contact);
    }

    public Contact removeContact(String name) {
        if (name == null) {
            throw new IllegalArgumentException("New is null");
        }
        return contacts.remove(name);
    }

    public Contact changeContaсt(String oldName,
                                 Contact contact) throws ChangeContactExeption {
        if (contact == null) {
            throw new IllegalArgumentException("Contact is null");
        }
        if (!contacts.containsKey(contact.getName())) {
            throw new ChangeContactExeption(
                    "Contact whith name" + oldName + "not exists"
            );
        }
        if (!oldName.equals(contact.getName())) {
            if (contacts.containsKey(contact.getName())) {
                throw new ChangeContactExeption(
                        "Contact whith name" + contact.getName() + "already exists"
                );
            }
            contacts.remove(oldName);
        }
        return contacts.replase(contact.getName(),contact);
}


    public Contact moveToFavorite (String name, String number, int fastCall){
       if(name == null || number == null){
           throw new IllegalArgumentException("Contact or name is null");
       }
        Contact contact = contacts.get(name);
       if(contact == null){
           throw FavoriteContactExeption("Contact"+ name + "not exist");
       }
        if(favoriteContacts.containsKey(fastCall)){
            throw new FavoriteContactExeption(
                    "Hot key" + fastCall + "already in use."
            );
        }
        FavoriteContactExeption favoriteContactExeption = new FavoriteContact(
                name,
                contact.getWorkNumbers(),
                contact.getPersonalNumbers(),
                fastCall,
                number
        );
        return favoriteContacts.put(fastCall, favoriteContacts);
    }



    public Contact moveToContacts (String name){
        return null;
    }
}

 */
