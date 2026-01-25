
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int q = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            a[n-1] = Math.max(a[n-1], b[n-1]);
            for(int i=n-2;i>=0;i--){
                a[i] = Math.max(a[i], Math.max(a[i+1], b[i]));
            }
            int[] dp = new int[n+1];
            dp[0] = 0;
            for(int i=1;i<n+1;i++){
                dp[i] = dp[i-1] + a[i-1];
            }
            while (q-- > 0) {
                int l = scanner.nextInt();
                int r = scanner.nextInt();
                int ans = dp[r] - dp[l-1];
                System.out.print(ans+" ");
            }
            System.out.println();
        }
    }
}
