public class pet {
    public static void main(String[] args) {
        dog d1 = new dog(4,"bruno");
        System.out.println("my dog legs is " + d1.legs+ " and his name is " + d1.name);

    }
}
class dog{
    int legs;
    String name;
    dog(int legs1, String name1) {
        this.legs =legs1;
        this.name = name1;
    }
}

