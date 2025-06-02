package introduction.packageintro.staticexamples;
//this is a demo to show initialisation of static variables;
public class StaticBlock {
    static int a = 4;
    static int b;
    static{
        b = a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj  = new StaticBlock();
        System.out.println(StaticBlock.a+" "+ StaticBlock.b);
        b+=3;
        System.out.println(StaticBlock.a+" "+ StaticBlock.b);
        StaticBlock obj2  = new StaticBlock();
        System.out.println(StaticBlock.a+" "+ StaticBlock.b);
    }

}
