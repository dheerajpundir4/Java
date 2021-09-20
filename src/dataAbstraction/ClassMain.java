package dataAbstraction;

//Here I implementating the data Abstractions
public class ClassMain {

    public static void main(String []args) {
        MyInterface myInterface = new ClassA();
        myInterface.sum();

         myInterface = new ClassB();
        myInterface.sum();
    }
}
