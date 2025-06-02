package Inheritance;

public class boxweight extends box{
    double weight ;
    public boxweight(){
        this.weight = -1;

    }
    boxweight (double side,double weight){
        super(side);
        this.weight  = weight;
    }
    boxweight (boxweight other){
        super(other);
        weight = other.weight;
    }
    public boxweight(double l,double h,double w, double weight){
        super(l,h,w);// what is this call the parent class constructor used to access value of super class variables
        this.weight = weight;
//        System.out.println(super.weight);

    }
}
