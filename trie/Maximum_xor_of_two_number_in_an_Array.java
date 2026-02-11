
public class Maximum_xor_of_two_number_in_an_Array {

    public static void main(String[] args) {
        int[] arr = {3, 10, 5, 25, 2, 8};
        Trie t = new Trie();
        for(int x : arr)
        {
          t.add(x);
        }
        int ans = 0;

        for (int x : arr) {
            ans = Math.max( t.getMaxXor(x),ans);
        }

        System.out.println(ans);
    }

    static class Trie {

        class Node {
            Node zero;
            Node one;
        }

        private Node root = new Node();
        public void add(int val) {
            Node curr = root;
            for (int i = 31; i >= 0; i--) {
                int bit = (val >> i) & 1;

                if (bit == 0) {
                    if (curr.zero == null)
                        curr.zero = new Node();
                    curr = curr.zero;
                } else {
                    if (curr.one == null)
                        curr.one = new Node();
                    curr = curr.one;
                }
            }
        }

        public int getMaxXor(int x) {
            int ans = 0;
            Node curr = root;

            for (int i = 31; i >= 0; i--) {
                int bit = (x >> i) & 1;

                if (bit == 0) {
                    if (curr.one != null) {
                        ans |= (1 << i);
                        curr = curr.one;
                    } else {
                        curr = curr.zero;
                    }
                } else {
                    if (curr.zero != null) {
                        ans |= (1 << i);
                        curr = curr.zero;
                    } else {
                        curr = curr.one;
                    }
                }
            }
            return ans;
        }
    }
}