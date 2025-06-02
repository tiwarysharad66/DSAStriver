
public class Contact {
    long id;
    String name;
    String phoneNumber;
    String email;
Contact(String name,String phoneNumber,String email){
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.email = email;
}
    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

 }
