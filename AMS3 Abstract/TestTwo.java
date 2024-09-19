abstract class A{
    public abstract void m1();

}
abstract class B extends A {
    public abstract void m1();

}
class Test{
    public ststic void main (String[]args) {
        new B();
    }
}
