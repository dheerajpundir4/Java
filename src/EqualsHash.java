class Money{
    int amount;
    String currencyCode;

    public Money(int amount, String currencyCode) {
        this.amount = amount;
        this.currencyCode = currencyCode;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==this) return  true;
        if(!(obj instanceof Money)) return false;
        Money other=(Money) obj;
        boolean currencyCodeEquals=(this.currencyCode==null && other.currencyCode==null) ||
                this.currencyCode!=null && this.currencyCode.equals(other.currencyCode);
        return this.amount== other.amount && currencyCodeEquals;
    }
}

public class EqualsHash {
    public static void main(String []args){
        //The default implementation of equals() in the class Object says that equality is the same as object identity.
        // And income and expenses are two distinct instances.
        Money income=new Money(55,"USD");
        Money expanses=new Money(55,"USD");
        boolean balanced=income.equals(expanses);
        System.out.println(balanced);
    }
}
