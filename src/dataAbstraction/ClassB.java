package dataAbstraction;

public class ClassB implements MyInterface{
    @Override
    public void sum() {
        System.out.println(2*(i+j));
    }

    public void display(){
        System.out.println("display");
    }
}
