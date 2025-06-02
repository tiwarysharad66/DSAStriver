package introduction;

public class Main
{
    public static void main(String[] args) {
        // store 5 roll numbers
        int[] numbers = new int[5];
        // store 5 names
        String [] names  = new String[5];
        // data of 5 students: {roll no, marks, name}
        int rno[] = new int[5];
        float[] marks  = new float[5];
        String[] name  = new String[5];
        Student student[]  = new Student[5];
        // just declaring student sharad object
//        Student sharad;
//        sharad = new Student();
        Student sharad  = new Student(13, "sharadbro",52.4f);

sharad.changename("sharadbro");
sharad.greeting();

        System.out.println(sharad); // print some random value
        System.out.println(sharad.rno);
        System.out.println(sharad.name);
        System.out.println(sharad.marks);
        Student random = new Student(sharad);
        System.out.println(random.name);
        Student random2 = new Student();
        System.out.println(random2.name);
        Student one  = new Student();
        Student two = one;
        one.name  = "sharadiii";
        System.out.println(two.name);

    }

    public void greetings() {
    }
}
// create a class for every single student
class Student{
int rno;
float marks;
String name;
    // we need a way to add above properties for object by object so we need one word to access every object
    void greeting() {
        System.out.println("my name is " +this. name);
    }
    void changename(String newname){
       this. name = newname;
    }
    Student(Student other){
        this.name  = other.name;
        this.rno = other.rno;
        this.marks = other.marks;

    }
    Student(){
        // this is how you call a constructor from another constructor
        this(13,"default person",100);
    }
//    Student(){
//        this.name = "sharad";
//        this.rno = 60;
//        this.marks = 55.43f;
//    }
    // Student arpit = new Student(1,"arpit",45)
//    here this will be replaced by arpit
Student (int rno, String name,float marks){
   this. rno= rno;
 this.   name = name;
  this.  marks = marks;
}
        }