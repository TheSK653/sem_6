
import java.util.*;

public class Coin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr=new double[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
        double[][] dp=new double[(n+1)/2+1][n+1];
        for(double[] a:dp){
            Arrays.fill(a,-1.0);
        }
        System.out.print(probability(arr, (n+1)/2, 0, dp));
    }
    public static double probability(double[] arr, int h, int i, double[][] dp ){
        if(h==0){
            return 1.0;
        }else if(i==arr.length){
            return 0.0;
        }else if(dp[h][i]!=-1.0){
            return dp[h][i];
        }
        double head=arr[i]*probability(arr, h-1, i+1, dp);
        double tail=(1.0-arr[i])*probability(arr, h, i+1, dp);
        return dp[h][i]=head+tail;
    }
}