package ibm;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ParseTree {

    public static void main(String[] args) {
        String str = "(S (NP (NNP James)) (VP (VBZ is) (NP (NP (DT a) (NN boy)) (VP (VBG eating) (NP (NNS sausages))))))";

        StringTokenizer st = new StringTokenizer(str, "()");

        Node root = new Node(st.nextToken());

        Node currNode = root;
        while (st.hasMoreTokens()) {
            String expr = st.nextToken();
            if ("".equals(expr.trim())) {
                currNode = currNode.parent;
                continue;
            }
            Node n = new Node(expr);
            currNode.addChild(n);
            if (n.data == null)
                currNode = n;
        }
        System.out.println(root.toSentence());
    }

    static class Node {
        String data;
        String type;
        List<Node> children = new ArrayList<>();
        Node parent;

        public Node(String data, String type) {
            this.data = data;
            this.type = type;
        }

        public Node(String expr) {
            String[] arr = expr.split(" ");
            if (arr.length > 0) {
                this.type = arr[0];
                if (arr.length > 1) {
                    this.data = arr[1];
                }
            }
        }

        public void addChild(Node child) {
            children.add(child);
            child.parent = this;
        }

        String toSentence() {
            StringBuffer sb = new StringBuffer();
            if (data != null)
                sb.append(data).append(' ');
            for (Node child : children)
                sb.append(child.toSentence());
            return sb.toString();
        }

    }

}
