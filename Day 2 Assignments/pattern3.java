import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Hollow Inverted Right Triangle Pattern Rows = ");
        int rows = sc.nextInt();
        sc.close();
        System.out.println("Print Hollow Inverted Right Triangle Star Pattern");
        for (int i = rows; i > 0; i-- ) {
        if(i == 1 || i == rows) {
            for (int j = 1 ; j <= i; j++ ) {
                System.out.print("*");
            }
        }
        else {
            for (int k = 1 ; k <= i; k++ ) {
                if(k == 1 || k == i) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }
}
}
