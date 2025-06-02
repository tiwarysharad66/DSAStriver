public class Student {
    public static void main(String[] args) {
        Person p = new Person("sharad",19);
        System.out.println("my name is " +p.name + " and my age is "+p.age);
    }
}
class Person{
    String name;
    int age;
    Person(String name_p,int p_age){
     this.name = name_p;
     this.age = p_age;
    }

}
