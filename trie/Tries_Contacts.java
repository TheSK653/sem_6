
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.stream.IntStream;

//Hackerrank Problem Link: https://www.hackerrank.com/challenges/ctci-contacts/problem
public class Tries_Contacts {

    class Node {

        char ch;
        boolean isTerminal;
        HashMap<Character, Node> child;
        int count;

        public Node(char ch) {
            this.ch = ch;
            this.child = new HashMap<>();
            this.count = 0;
        }
    }

    private Node root;

    public Tries_Contacts() {
        root = new Node('*');
    }

    public void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            curr.child.putIfAbsent(ch, new Node(ch));
            curr = curr.child.get(ch);
            curr.count++;   // count words passing through this node
        }
        curr.isTerminal = true;
    }

    public int find(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            if (!curr.child.containsKey(ch)) {
                return 0;
            }
            curr = curr.child.get(ch);
        }
        return curr.count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        Tries_Contacts trie = new Tries_Contacts();

        IntStream.range(0, n).forEach(i -> {
            try {
                String[] input = bufferedReader.readLine().split(" ");
                String op = input[0];
                String word = input[1];

                if (op.equals("add")) {
                    trie.insert(word);
                } else if (op.equals("find")) {
                    System.out.println(trie.find(word));
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        bufferedReader.close();
    }
}
