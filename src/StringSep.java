import java.util.ArrayList;

class Cric {
    String firstName;
    String secondName;
    int phone;
    String email;

    public Cric(String firstName, String secondName, int phone, String email) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.phone = phone;
        this.email = email;
    }
}

public class StringSep {
    public static void main(String[] args) {
        ArrayList<Cric> arrayList = new ArrayList<>();

        String firstName = "";
        String secondName = "";
        int phone = 0;
        String email = "";

        String str = "Virat kohli 8880625601 virat.kohli@gmail.com. Rahul Rahul_181@gmail.com 9945099450. 9845198451 Ravindra Jadeja Ravindra_jadeja@gmail.com";

        String sb = "";


        for (char ch : str.toCharArray()) {

            System.out.println(phone);
            if ((firstName != "" || secondName != "") && phone != 0 && email != "") {
                System.out.println("=====");
                arrayList.add(new Cric(firstName, secondName, phone, email));

                firstName = "";
                secondName = "";
                phone = 0;
                email = "";

            }

            if (ch != ' ') {

                sb = sb + ch;



            } else {
                if (phone == 0 && (!sb.contains(".com"))) {
                    boolean flag=false;


                    for(int i=0;i<=9;i++)
                        if(sb.charAt(i)==i) flag=true;
//                    System.out.println(sb.charAt(0));
//                    System.out.println(sb + " "+flag);

                    if(flag==true) {

                        phone = Integer.parseInt(sb);
                        sb = "";
                        continue;
                    }
                }

                if (firstName.equals("") && (!sb.contains(".com"))) {
                    firstName = sb;
                    sb = "";
                    continue;
                }

                if (secondName.equals("") && (!sb.contains(".com"))) {
                    secondName = sb;
                    sb = "";
                    continue;
                }

                if (email == "" && sb.contains(".com")) {
                    email = sb;
                    sb = "";
                    continue;
                }




                sb = "";
            }

        }

        System.out.println(arrayList);
        arrayList.stream().forEach(cric -> {
            System.out.println("name "+cric.firstName);
            System.out.println("second "+cric.secondName);
            System.out.println("phone "+cric.phone);
            System.out.println("email "+cric.email);
        });
    }
}
