import java.util.Scanner;
public class DistanceEqn {
    public double formulae(double V,double U,double a,double S){
        return ((Math.pow(V, 2)+Math.pow(U, 2))/(2*a*S));
    }
    public static void main(String[] args){
        DistanceEqn ob = new DistanceEqn();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter V");
        double V=sc.nextDouble();
        System.out.println("Enter U");
        double U=sc.nextDouble();
        System.out.println("Enter a");
        double a=sc.nextDouble();
        System.out.println("Enter S");
        double S=sc.nextDouble();
        sc.close();
        System.out.println(+ob.formulae(V, U, a, S));
    }
}
