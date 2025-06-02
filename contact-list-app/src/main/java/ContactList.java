import java.util.*;
//crud --> create read all or read one update delete
public class ContactList {
    List<Contact> contacts ;
     ContactList(){
         contacts = new LinkedList<>();
    }
    void add(Contact contact){
         contacts.add(contact);
    }
}
