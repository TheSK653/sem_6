
import java.util.HashSet;
import java.util.Scanner;

public class najpf {
    public static void main(String[] args) {
        // String s = "ababcabc";
        // String p = "abc";
        // Robin_karp(s, p);
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            String p = sc.next();
            Robin_karp(s, p);
        }
    }
    public static void Robin_karp(String s, String p) {
        int m = p.length();
        int n = s.length();
        if (m > n) return;

        int pHash = 0;
        for (int i = 0; i < m; i++) {
            pHash += p.charAt(i) - 'a';
        }
        
        int sHash = 0;
        for (int i = 0; i < m; i++) {
            sHash += s.charAt(i) - 'a';
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i <= n - m; i++) {
            if (sHash == pHash && s.substring(i, i + m).equals(p)) {
                set.add(i);
            }
            if (i < n - m) {
                sHash -= s.charAt(i) - 'a';
                sHash += s.charAt(i + m) - 'a';
            }
        }
        if(set.size()>0)
        System.out.println(set.size());
        for (int idx : set) {
            System.out.print(idx + 1 + " ");
        }
    }
}
