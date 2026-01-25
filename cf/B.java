import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int l=n,r=n;
            for(int i=0;i<n;i++){
                if(arr[i]!=n-i) {
                    l=i;
                    break;
                }
            }
            for(int i=l+1;i<n;i++){
                if(arr[i]==n-l){
                    r=i;
                    break;
                }
            }
            for(int i=0;i<l;i++){
                System.out.print(arr[i]+" ");
            }
            if(l!=n){
                for(int i=r;i>=l;i--){
                    System.out.print(arr[i]+" ");
                }
                for(int i=r+1;i<n;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.err.println();
        }
    }
}
