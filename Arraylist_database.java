import java.util.*;
import java.util.*;
public class Arraylist_database {
    public void  display(ArrayList name,ArrayList roll,ArrayList sem,ArrayList CGPA){
        for (int i = 0; i < name.size(); i++) {
            System.out.print(name.get(i) + " ");
            System.out.print(roll.get(i) + " ");
            System.out.print(sem.get(i) + " ");
            System.out.print(CGPA.get(i) + " ");
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> roll =new ArrayList<>();
        ArrayList<Integer> sem =new ArrayList<>();
        ArrayList<Float> CGPA =new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to enter a new student data? y/n:");
        char flag=sc.next().charAt(0);
        while(flag=='y'||flag=='Y'){
            sc.nextLine();
            System.out.println("enter student name");
            name.add(sc.nextLine());
            System.out.println("enter student Roll");
            roll.add(sc.nextInt());
            System.out.println("enter student Semester");
            sem.add(sc.nextInt());
            System.out.println("enter student CGPA");
            CGPA.add(sc.nextFloat());
            System.out.println("Add more data? y/n");
            flag=sc.next().charAt(0);
        }
        sc.close();
        Arraylist_database ob =new Arraylist_database();
        ob.display(name,roll,sem,CGPA);   
    }
}
