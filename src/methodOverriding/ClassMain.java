package methodOverriding;

public class ClassMain {
    public static void main(String[] args){
        ClassB objB=new ClassB();
        ClassA objA=new ClassB();
       objB.display();
       objA.display();
    }
}
