import java.util.Scanner;
public class Summation {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        long N = myObj.nextLong();
        long sum =0;
        for(int i=1;i<=N;i++){
            long Num = myObj.nextLong();
            sum+=Num;
        }
        System.out.println(Math.abs(sum));
    }
}
