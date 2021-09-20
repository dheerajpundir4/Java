public class StringJava {
    public static void main(String []args){
        String a="name";
        String b="name";
        String c=new String("name");
        String d="name";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(a==c);
        System.out.println(a==b);
        System.out.println(a.equals(c));
        System.out.println(c==d);
        System.out.println(a==d);

    }
}
