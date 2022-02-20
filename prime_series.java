public class prime_series{    
    public boolean primecheck(int n){    
        if(n==0||n==1){  
            return false;      
        }
        else{  
            for(i=2;i<=n/2;i++){      
                if(n%i==0){      
                    return false;
                }
            }      
            return true;
        }
    }
    public static void main(String[]args){
        prime_series ob= new prime_series();
        for (int i =2;i<1000;i++){
            if (ob.primecheck(i)){
                System.out.println(i);
            }
        }
    }      
}
