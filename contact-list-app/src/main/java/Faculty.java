public class Faculty extends Contact{
    String Subjects;

    @Override
    public String toString() {
        return "Faculty{" +
                "Subjects='" + Subjects + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    Faculty(String name, String phoneNumber, String email) {
        super(name, phoneNumber, email);
    }
}
