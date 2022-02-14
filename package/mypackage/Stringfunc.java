package mypackage;
public class Stringfunc{
    public String concat(String s1,String s2){
        return s1+s2;
    }
    public int length(String s1){
        int count=0;
        while(s1.toCharArray()){
            count++;
        }
        return count;
    }
    public String subStr(String s1, int i , int j){
        String buff="";
        for (int k = i;k<=j;k++){
            buff+=s1.charAt(k);
        }
        return buff;
    }

}
