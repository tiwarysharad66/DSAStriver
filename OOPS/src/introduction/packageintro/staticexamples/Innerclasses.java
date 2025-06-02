package introduction.packageintro.staticexamples;

public class Innerclasses {
    static class test{
        String name;
        public test(String name){
            this.name  = name;
        }

        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        test a  = new test("sharad");
        test b = new test("hello");
        System.out.println(a.name+" "+ b.name);
        System.out.println(a);
    }
}
