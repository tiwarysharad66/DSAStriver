public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact("Sharad","8130558865","tiwarysharad66@gmail.com");

        ContactList list=  new ContactList();
        list.add(contact);
        System.out.println(list.contacts);

    }
}
