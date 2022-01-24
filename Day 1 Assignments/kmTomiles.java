import java.util.Scanner;
public class kmTomiles {
    public double convert(double km){
        return (0.621*km);
    }
    public static void main(String[] args){
        kmTomiles ob= new kmTomiles();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in KM");
        double km=sc.nextDouble();
        sc.close();
        System.out.println("Distance in miles is "+ob.convert(km)+" mi");
    }
}
