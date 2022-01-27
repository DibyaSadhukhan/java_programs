package mypackage;
public class Stringfunc{
    public String concat(String s1,String s2){
        return s1+s2;
    }
    public String subStr(String s1, int i , int j){
        String buff="";
        for (int k = i;k<=j;k++){
            buff+=s1.charAt(k);
        }
        return buff;
    }
    /*public String[] split(String s1,char a){
        
        for i in range
    }
    */
}
