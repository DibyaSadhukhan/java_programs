class A{
    A(){
        System.out.print("A");
    }
    
}
class B extends A{
    B(){
        System.out.print("B");
    }
}
class C extends B{
    C(){
        System.out.print("C");
    }
}
class multilevelInheritance {
    public static void main(String args[]){
        C c =new C();
    }
}
