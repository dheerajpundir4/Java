package TSYSPractice;

import java.io.IOException;

public class MainClass {

    final int number1=0; //variable number1 not initialized in the default constructor

    public static void main(String []args){
      //  int i; //variable i might not have been initialized.
      //  System.out.println(i);
      //  System.out.println(new MainClass().number1);

        try
        {
            System.out.println("1");
            // some code throw IOException
            throw new IOException();
        } catch (IOException IO) {
            System.out.println("3");
        } catch (Exception e) {
            System.out.println("2");
        } finally {
            System.out.println("4");
        }
    }
}
