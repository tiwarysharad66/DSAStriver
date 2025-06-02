package polymorphism;

public class square extends shapes{
    //this will run when the obj of circle is created
    //hence it is overiding the shapes
    @Override// this is an annotation;
    void area(){
        System.out.println("side*side");
    }
}
