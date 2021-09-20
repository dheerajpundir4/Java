package SingletonDesignPattern;

class SimplePattern{
    private SimplePattern(){}
    public static SimplePattern simplePattern;
    public static SimplePattern getInstance(){
        if(simplePattern==null){
            simplePattern=new SimplePattern();
        }
        return simplePattern;
    }
}

class DoublePattern{
    private DoublePattern(){}
    public static DoublePattern doublePattern;
    public static DoublePattern getInstance(){
        if(doublePattern==null){
            synchronized (DoublePattern.class){
                if(doublePattern==null){
                    doublePattern=new DoublePattern();
                }
            }
        }
        return doublePattern;
    }
}

public class MainSimplePattern {
    public static void main(String[] args){
        SimplePattern simplePattern1=SimplePattern.getInstance();
        SimplePattern simplePattern2=SimplePattern.getInstance();
        SimplePattern simplePattern3=SimplePattern.getInstance();

        DoublePattern doublePattern1=DoublePattern.getInstance();
        DoublePattern doublePattern2=DoublePattern.getInstance();
        DoublePattern doublePattern3=DoublePattern.getInstance();
        System.out.println(simplePattern1==simplePattern2);

    }
}
