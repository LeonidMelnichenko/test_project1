package src.lesson200223.exeptions;

import src.lesson200223.Contacts.FavoriteContact;

public class FavoriteContactExeption extends RuntimeException{
    public FavoriteContactExeption(String message){
        super(message);
    }

}
