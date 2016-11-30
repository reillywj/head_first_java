class Tester {
    int a = 5;
    void setA(int b) {
        a = b;
    }
    
    int getA() {
        return a;
    }
}

public class VarTest {
    public static void main (String [] args) {
        Tester a = new Tester();
        System.out.printf("a is %d\n", a.getA());
        Tester b = a;
        System.out.printf("a is %d, b is %d\n", a.getA(), b.getA());
        a.setA(10);
        System.out.printf("a is %d, b is %d, a + b is %d\n", a.getA(), b.getA(), a.getA() + b.getA());
        a = new Tester();
        System.out.printf("a is %d, b is %d, a + b is %d\n", a.getA(), b.getA(), a.getA() + b.getA());
    }
}