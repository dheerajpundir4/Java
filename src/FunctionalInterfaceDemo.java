

// A Functional Interface can not extend another interface
@FunctionalInterface
interface Foo{
    public default String HelloWorld(){
        return "Hello World";
    }

    public default String HelloWorld2(){
        return "Hello World";
    }

    public void bar();

}


class A implements Foo{

    @Override
    public void bar() {

    }
}
public class FunctionalInterfaceDemo {
}
