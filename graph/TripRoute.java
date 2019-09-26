package me.algo.graph;

import java.util.*;

/**
 * Created by bomi on 2019-09-25.
 *
 * 문제 출처: https://programmers.co.kr/learn/courses/30/lessons/43164?language=java
 * 사용한 알고리즘: DFS(깊이 우선 탐색)
 * 사용한 자료구조: 배열, ArrayList
 */

public class TripRoute {
    public static void main(String[] args) {
//        String[] answer = solution(new String[][]{{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}});
        String[] answer = solution(new String[][]{{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}});
        System.out.println(Arrays.toString(answer));
    }

    private static String[] solution(String[][] tickets) {
        int length = tickets.length;
        boolean[] visited = new boolean[length];
        List<String> answer = new ArrayList<>();

        Arrays.sort(tickets, (Comparator.comparing((String[] array) -> array[1])));

        dfs("ICN", tickets, answer, visited, 0);

        return answer.toArray(new String[]{});
    }

    private static boolean dfs(String from, String[][] tickets, List<String> answer, boolean[] visited, int count) {
        answer.add(from);

        if(count == tickets.length) {
            return true;
        }

        for(int i=0; i<tickets.length; i++) {
            if(from.equals(tickets[i][0]) && !visited[i]) {
                visited[i] = true;
                boolean endCheck = dfs(tickets[i][1], tickets, answer, visited, count+1);
                if(endCheck) {
                    return true;
                }
                visited[i] = false;
            }
        }

        answer.remove(answer.size()-1);
        return false;
    }
}
