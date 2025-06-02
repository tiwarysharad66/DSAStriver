package polymorphism;

public class objprint {
    int num;
    objprint(int num){
        this.num =num;
    }

    public static void main(String[] args) {
        objprint obj = new objprint(10);
        System.out.println(obj);
    }
}
