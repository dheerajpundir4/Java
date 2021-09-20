public class HashingDemo {
    public static void main(String[] args){
        String s="dheeraj";
        String s3="dheeraj";
        String s1= new String("dheeraj");
        System.out.println(s==s3);
        System.out.println(s.equals(s3));
        System.out.println(s==s1);
        System.out.println(s.equals(s1));
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
    }
}
