package Study1.BFS;

import java.util.*;

public class BFSExample {
    public static void bfs(int start, List<List<Integer>> graph) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[graph.size()];

        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    queue.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        // 그래프 초기화
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < 5; i++) graph.add(new ArrayList<>());
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);

        bfs(0, graph);
    }
}

