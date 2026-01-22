
import java.util.Scanner;

public class setTheoryVenn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(venn_diagram(arr, n));
    }
    public static int venn_diagram(int[] arr, int n) {
        int count=0;
        for(int i=0;i<(1<<n);i++){
            int ans=power_set(arr,i);
            if(set_bit(i)%2==0){
                count-=ans;
            }
            else{
                count+=ans;
            }
        }
        return count;
    }
    public static int set_bit(int i){
        int c=0;
        while(i>0){
            i=(i & (i-1));
            c++;
        }
        return c;
    }
    public static int power_set(int[] arr, int i){
        int ans=1;
        int idx =0;
        while(i>0){
            if((i&1)!=0){
                ans*=arr[idx];
            }
            idx++;
            i>>=1;
        }
        return ans;
    }
}
