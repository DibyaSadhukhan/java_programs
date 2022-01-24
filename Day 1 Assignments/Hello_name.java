import java.util.Scanner;
public class Hello_name {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String s = sc.next();
        sc.close();
        System.out.println("Hello "+s+", have a good day");
        
    }
}
