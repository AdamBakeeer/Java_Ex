import java.util.Scanner;

public class weight {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("enter weight in kilos: ");
        double km = myObj.nextDouble();

        double lbs = km * 2.205;

        int pounds = (int)lbs;

        double oz = (lbs - pounds) * 16;

        System.out.printf("Equivalent imperial weight in  %d lb %.1f oz "  , (int)lbs , oz);

        myObj.close();

    }
}