import java.util.Scanner;
 
public class sum_of_even_numbers{
    public static int find_sum(int n){
		int sum=0;
		for(int count=2; count<=n;count=count+2 ){
		    sum+=count;
		}
        return sum;
    }
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();
		System.out.println("Sum: "+find_sum(n));
        sc.close();
    }
}
