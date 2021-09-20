package builderDesignerPattern;


/*

Builder Pattern and Creation Desing patteren
 */
public class Shop {
    public static void main(String []args){
      Phone p =new PhoneBuilder().setOs("ABCD").getPhone();
        System.out.println(p);
    }
}
