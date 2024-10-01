import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            //int c=finc(2345,2346,2345,7);
        int[] b={1,2,3,4,5,6,7,8,9,10};
        int a=primec(b,10);
        System.out.println(a);
    }
    public static int primec(int[] a,int size){
        ArrayList<Integer> in=new ArrayList<Integer>();
        for(int i=0;i<size;i++){
            if(isprime(a[i])){
                in.add(a[i]);
            }
        }
        int c=0;
        Collections.sort(in);
        for(int n:in){
            c+=n;
        }
        return c-(in.get(0));
    }
    public static boolean isprime(int n){
        if(n<=2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}