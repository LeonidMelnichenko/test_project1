/*package src.lesson200223.Contacts;

import src.lesson200223.exeptions.ChangeContactExeption;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook(new HashMap<>());
        Contact qwe = new Contact("qwe", new HashSet<>(), new HashSet<>());
        phoneBook.addContact(qwe);
        System.out.println(phoneBook);

        qwe.setName("new nmae");

        try{
            phoneBook.changeContaсt("qwe", qwe);
        } catch (ChangeContactExeption e){
            System.out.println("can not change contact: " + qwe);
        }
        System.out.println(phoneBook);
    }
}

 */
