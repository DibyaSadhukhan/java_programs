import java.util.Scanner;
public class pattern8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i, j, space, count = 1, num = 0, star = 8;
        int n = sc.nextInt();
        space = n;
        for (i = 1; i <= n; i++){
            for (j = 1; j <= star; j++)
                if(i + j <= star + 1)
                    System.out.print("*");
            num++;
            for (j = 1; j <= i; j++){
                System.out.print(num);
                if (i > 1 && count < i){
                    System.out.print("*");
                count++;
                }
            }
            for (j = 1; j <= star; j++)
                if(i + n <= j + n)
                    System.out.print("*");
                System.out.println();
                space--;
                count = 1;
        }
    }
}

