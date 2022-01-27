import java.util.Scanner;
public class Result_check {
    public boolean check_Result(int sub1,int sub2,int sub3,int sub4){
        if (sub1>=33 && sub2>=33 && sub3>=33 && sub4>=33 && (sub1+sub2+sub3+sub4)>160){
                return true;
        }
        else{
                return false;
            }
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks of sub1");
        int sub1 = sc.nextInt();
        System.out.println("Enter marks of sub2");
        int sub2 = sc.nextInt();
        System.out.println("Enter marks of sub3");
        int sub3 = sc.nextInt();
        System.out.println("Enter marks of sub4");
        int sub4 = sc.nextInt();
        sc.close();
        Result_check ob= new Result_check();
        System.out.println(ob.check_Result(sub1,sub2,sub3,sub4));
    }
}

