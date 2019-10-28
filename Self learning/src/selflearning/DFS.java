package selflearning;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS {
	int V;
	LinkedList<Integer> adj[];
    
	void traverse(int s) {
        boolean visited[] = new boolean[V];
        util(s, visited);
    }

    void util(int s, boolean visited[]) {
        visited[s] = true;
        System.out.print(s + " ");

        Iterator<Integer> i = adj[s].listIterator();
        while(i.hasNext()) {
            int n = i.next();
            if(!visited[n])
                util(n, visited);
        }
    }
}
