abstract class MyClass {
    int a;
    int b;

    public MyClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void m1() {
        System.out.println("this is m1");
    }

    abstract  void m2();
}

class Noway extends MyClass {
     public Noway(int a , int b){
        super(a,b) ;
     }
    @Override
    void m2() {
    }

}

public class Trial {
  public static void main(String[] args) {

     int x =20 ;
     int y = 20 ;
     System.out.println(x>y ? "10 is grater " : "20 is greater");

    final int a  ;
    a=45 ;
    System.out.println(a);
    Noway n = new Noway(15, 15) ;
    System.out.println(n instanceof Noway);
  }
}
