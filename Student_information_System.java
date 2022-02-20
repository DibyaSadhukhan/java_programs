import java.util.Scanner; 
public class Student_information_System { 
    public static void main(String[] args){ 
        Scanner sc=new Scanner(System.in); 
        student[] obj=new student[10]; 
        obj[0]=new student("abc",1,"IT",2); 
        obj[1]=new student("acb",2,"EIE",5); 
        obj[2]=new student("bca",3,"EIE",1); 
        obj[3]=new student("cab",4,"IT",4); 
        obj[4]=new student("cba",5,"IT",7); 
        for(int i = 5; i < 10; i++) 
        obj[i] = null; 
        int i = 0,choice; 
        do 
        { 
            System.out.println("\n\t\t***CHOOSE AN OPTION***"); 
            System.out.println("\n\t1. Input new student detail: "); 
            System.out.println("\t2. Delete any old student detail: ");
            System.out.println("\t3. Display any student detail: "); 
            System.out.println("\t4. Update any student details: "); 
            System.out.println("\t5. Exit"); 
            System.out.print("\n\tWhat do you want, please enter: "); 
            choice=sc.nextInt(); 
            switch(choice){ 
                case 1: 
                { 
                    obj[i] = new student(); 
                    obj[i].input(); 
                    i++; 
                    System.out.println("\n***Details inputted successfully ***"); 
                    break; 
                } 
                case 2: 
                { 
                    System.out.print("\tEnter the roll no of student for deletion: "); 
                    int r=sc.nextInt(); 
                    boolean flag1 = false; 
                    for(int j = 0; obj[j] != null; j++){ 
                        if(obj[j].roll == r){ 
                            flag1 = true; 
                            obj[j] = null;
                            System.out.println("\n\t---Details deleted---"); 
                            break; 
                        }
                    } 
                    if(!flag1) 
                        System.out.println("\n\tPlease enter correct roll!"); 
                    break; 
                } 
                case 3: 
                { 
                    System.out.println("\tEnter roll no of student to display details: "); 
                    int r1=sc.nextInt(); 
                    boolean flag1 = false; 
                    for(int j = 0; obj[j] != null; j++) { 
                        if(obj[j].roll == r1){ 
                            flag1 = true; 
                            obj[j].display(); 
                            break; 
                        } 
                    } 
                    if(!flag1) 
                        System.out.println("\n\tRoll No. Not Found!"); 
                    break;
                } 
                case 4: 
                { 
                System.out.print("\tEnter roll no of student for update details: "); 
                int r2=sc.nextInt(); 
                for(int j = 0; obj[j] != null; j++){ 
                    if(obj[j].roll == r2) { 
                        obj[j].update(); 
                        break; 
                    } 
                } 
                break; 
                } 
                case 5: 
                { 
                System.out.println("\tSuccessfully Exited: "); 
                break; 
                } 
                default: 
                { 
                System.out.println("Please enter correct input..."); 
                }
            }
        }while(choice!=5); 
        sc.close();
    }
} 

class student{ 
    String name; 
    int roll; 
    String stream; 
    int sem; 
    student(){ 
        name = ""; 
        roll = 0; 
        stream = ""; 
        sem=0;  
    } 
    student(String n1,int r1, String s1,int y1) { 
        name=n1; 
        roll=r1; 
        stream=s1; 
        sem=y1;  
    } 
    void input(){ 
        Scanner sc=new Scanner(System.in); 
        System.out.print("\tEnter name: "); 
        name=sc.nextLine(); 
        System.out.print("\tEnter roll: "); 
        roll=sc.nextInt(); 
        System.out.print("\tEnter stream : "); 
        stream=sc.next(); 
        System.out.print("\tEnter Semester: "); 
        sem=sc.nextInt();
        sc.close();
    } 
    void display() 
    { 
    System.out.println("\n\t\t***STUDENT DETAILS***"); 
    System.out.println("\n\t\tName : "+name); 
    System.out.println("\t\tRoll No : "+roll); 
    System.out.println("\t\tStream : "+stream);  
    System.out.println("\t\tYear : "+sem); 
    } 
    void update(){ 
        Scanner sc=new Scanner(System.in); 
        System.out.println("\n\t\t***WHAT DO YOU WANT UPDATE, CHOOSE AN OPTION*** "); 
        System.out.println("\t1. Name: "); 
        System.out.println("\t2. Roll: ");
        System.out.println("\t3. Stream: ");  
        System.out.println("\t4. Semester: "); 
        System.out.println("\t5. Exit"); 
        System.out.println("Please enter your option: "); 
        int flag=sc.nextInt(); 
        switch(flag){ 
            case 1: 
            { 
            System.out.println("\t\tEnter new name of student: "); 
            name=sc.next(); 
            break; 
            } 
            case 2: 
            { 
            System.out.println("\t\tEnter new roll no of student: "); 
            roll=sc.nextInt(); 
            break; 
            } 
            case 3: 
            { 
            System.out.println("\t\tEnter new stream of student: "); 
            stream=sc.next();
            break; 
            }  
            case 4: 
            { 
            System.out.println("\t\tEnter new Semester of student: "); 
            sem=sc.nextInt(); 
            break; 
            } 
            case 5: 
            { 
            System.out.println("\tExited: "); 
            break; 
            } 
            default: 
            System.out.println("\tWrong input,Please choose correct option"); 
        }
        sc.close();    
    }
} 
