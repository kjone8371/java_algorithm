package Study1.DFS;

import java.util.*;

public class DFSExample {
    public static void dfs(int node, boolean[] visited, List<List<Integer>> graph) {
        visited[node] = true; // 현재 노드를 방문
        System.out.print(node + " ");

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, graph);
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

        boolean[] visited = new boolean[5];
        dfs(0, visited, graph);
    }
}

