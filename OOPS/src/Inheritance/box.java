package Inheritance;

public class box {
   private double l;
    double w;
    double h;
//    double weight;
    box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }
    // cube
    box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }
    box(double l ,double w ,double h){
        this.l  = l;
        this.w= w;
        this.h =h;
    }
    box(box old){
        this.l = old.l;
        this. w = old.w;
        this.h = old.h;
    }
    public static void info(){
        System.out.println("box running");
    }
}
