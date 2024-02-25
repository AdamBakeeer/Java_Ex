import java.util.Scanner;  

public class milestokm {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Enter Distance in miles: ");
        float miles = myObj.nextFloat();

        float km = miles * 1.6034f;

        System.out.printf(" %.2f Distance in km" ,  km);
        myObj.close();


    }
}

