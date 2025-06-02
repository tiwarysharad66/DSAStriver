public class Student  extends Contact{
    String dateofbirth;

    @Override
    public String toString() {
        return "Student{" +
                "dateofbirth='" + dateofbirth + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    Student(String name, String phoneNumber, String email) {
        super(name, phoneNumber, email);
    }

}
