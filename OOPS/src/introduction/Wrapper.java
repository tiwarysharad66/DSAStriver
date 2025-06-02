package introduction;

public class Wrapper {
    public static void main(String[] args) {
        int a= 10;
        Integer x = 10;
        int b = 20;
        Integer y = 20;
        final int mod= 2;

      final  A sharad = new A("sharad");
      sharad.name  = "sharadbro";
//      sharad = new A("sharadjk");
        A obj;
      for(int i=0;i<1000000000;i++){
          obj = new A("sharadbrooo");
      }
    }
    static void swap(int a,int b){
        int temp = a;
        a= b;
        b = temp;
    }

}
class A{
    final int num =10;
    String name;
    public A(String name){
        System.out.print("object creat");
        this.name  = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}