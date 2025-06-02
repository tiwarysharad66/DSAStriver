package Inheritance;

public class boxprice extends boxweight {
    double cost;
    boxprice(){
        super();
        this.cost = -1;
    }
    boxprice(boxprice other) {
        super(other);
        this.cost = other.cost;
    }
    public boxprice(double l,double w,double h,double weight,double cost){
        super(l,h,w,weight);
        this.cost  = cost;
    }
    public boxprice(double side, double weight,double cost){
        super(side,weight);
//        box weight should have a constructor that takes the 2 argument
//        and if box weight calls box for the single argument constructor for the value of side and box should have 1 argument constructor
        this.cost = cost;
    }
}
