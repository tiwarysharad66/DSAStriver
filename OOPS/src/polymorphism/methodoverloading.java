package polymorphism;

public class methodoverloading {
    double sum(double a , double b){
        return a+b;
    }
    double sum(int a , int b){
        return a+b;
    }
    int sum(int a , int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        methodoverloading obj = new methodoverloading();
        obj.sum(2,3);
        obj.sum(2.0,3.23);
        obj.sum(1,23,4);
    }
}
