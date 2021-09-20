package onlyString;

public class MainClass {
    public static void main(String []args){
        Integer i=10;
        Integer j=new Integer(10);
        Integer l=10;
        int k=10;
        Integer m=new Integer(10);

        System.out.println(i==k);
        System.out.println(j==k);
        System.out.println(i==j);
        System.out.println(i==l);
        System.out.println(j==m);
    }
}
