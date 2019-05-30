package me.algo;

import java.io.IOException;

public class Network {
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        int answer = solution(3, new int[][]{{1,1,0}, {1,1,0}, {0,0,1}});
        System.out.println(answer);
    }

    private static int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n][n];

        for(int i=0; i<n; i++) {
            if(!visited[i][i]) {
                dfs(i, computers);
                answer++;
            }
        }
        return answer;
    }

    private static void dfs(int i, int[][] computers) {
        for(int j=0; j<computers.length; j++) {
            if(computers[i][j] == 1 && !visited[i][j]) {
                visited[i][j] = visited[j][i] = true;
                dfs(j, computers);
            }
        }
    }
}