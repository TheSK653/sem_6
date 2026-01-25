
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int s = scanner.nextInt();
            int x = scanner.nextInt();
            int ans = 0;
            while(n-->0){
                ans += scanner.nextInt();
            }
            if(s>=ans && (s-ans)%x==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }   
}
