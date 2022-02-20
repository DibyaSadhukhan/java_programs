package mathpackage;
public class Mathfunc {
    public int power(int i,int j){
        int power=0;
        while(j>0){
            power*=i;
        }
        return power;
    }
    public int squareroot(int i){
        float sqrt = (float)i / 2;
        float temp = 0;
        while(sqrt != temp){
            temp = sqrt;
            sqrt = (float)(( number/temp + temp) / 2);
        }
        return sqrt;
    }
}
