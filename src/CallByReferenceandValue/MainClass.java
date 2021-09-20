package CallByReferenceandValue;

import java.awt.*;

class A{

    String color;

    public A(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

public class MainClass {

    public void display(A color){
        color.setColor("blue");
        System.out.println(color.getColor());
    }

    public static void main(String[] args){
        A color=new A("red");
        System.out.println(color.getColor());
        MainClass mainClass=new MainClass();
        mainClass.display(color);
        System.out.println(color.getColor());
    }
}
