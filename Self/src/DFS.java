public class DFS {
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
